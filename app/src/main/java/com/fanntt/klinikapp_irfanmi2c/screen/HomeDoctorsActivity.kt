package com.fanntt.klinikapp_irfanmi2c.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.klinikapp_irfanmi2c.R
import com.fanntt.klinikapp_irfanmi2c.adapter.ListDoctorAdapter
import com.fanntt.klinikapp_irfanmi2c.adapter.MenuIconAdapter
import com.fanntt.klinikapp_irfanmi2c.model.ModelListDoctors

class HomeDoctorsActivity : AppCompatActivity() {


    private var recyleView : RecyclerView? = null
    private var MenuAdapter: MenuIconAdapter? = null
    private var doctorlist =  mutableListOf<ModelListDoctors>()
    private var menulist = mutableListOf<MenuIconAdapter>()
    private var DoctorAdapter : ListDoctorAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctors)

        doctorlist = ArrayList()
        menulist = ArrayList()
        recyleView = findViewById(R.id.rv_doctors)
        //DoctorAdapter = ListDoctorAdapter(this,doctorlist)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this,2
        )
        recyleView!!.layoutManager = layoutManager
        //recyleView!!.adapter = ListDoctorAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}