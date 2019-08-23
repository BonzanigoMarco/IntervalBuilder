package ch.scythetec.intervalbuilder.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import ch.scythetec.intervalbuilder.R
import kotlinx.android.synthetic.main.activity_main.*
import ch.scythetec.intervalbuilder.helper.StringHelper

class MainActivity : AbstractBaseActivity() {
    override fun getConfiguredLayout(): Int {
        return R.layout.activity_main;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main_button_builder.text = StringHelper.styleString(R.string.builder_icon,applicationContext)
        main_button_intervals.text = StringHelper.styleString(R.string.intervals_icon,applicationContext)
        main_button_settings.text = StringHelper.styleString(R.string.settings_icon,applicationContext)
    }

    override fun onButtonClicked(v: View) {
        when(v.id){
            R.id.main_button_builder -> {
                startActivity(Intent(this, IntervalActivity::class.java))
            }
        }
    }
}
