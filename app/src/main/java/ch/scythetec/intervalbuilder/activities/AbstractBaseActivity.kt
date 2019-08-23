package ch.scythetec.intervalbuilder.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import ch.scythetec.intervalbuilder.R

abstract class AbstractBaseActivity : AppCompatActivity() {

    abstract fun getConfiguredLayout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        supportActionBar?.hide(); //hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN); //show the activity in full screen
        setContentView(getConfiguredLayout())
    }

    public open fun onButtonClicked(v: View){

    }

}
