package ch.scythetec.intervalbuilder.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ch.scythetec.intervalbuilder.R

class SettingsActivity : AbstractBaseActivity() {
    override fun getConfiguredLayout(): Int {
        return R.layout.activity_settings;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
