package ch.scythetec.intervalbuilder.activities

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.children
import ch.scythetec.intervalbuilder.R
import ch.scythetec.intervalbuilder.helper.TimeHelper
import com.jmedeisis.draglinearlayout.DragLinearLayout
import kotlinx.android.synthetic.main.activity_inteval.*

class IntervalActivity : AbstractBaseActivity() {
    override fun getConfiguredLayout(): Int {
        return R.layout.activity_inteval;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        interval_layout_active.setOnViewSwapListener(DragLinearLayout.OnViewSwapListener() { view1: View, pos1: Int, view2: View, pos2: Int ->
            refreshLayout(interval_layout_active)
            //https://github.com/justasm/DragLinearLayout
        })
    }

    fun refreshLayout(parent:  View?){
        var counter = 1
        if (parent != null && parent is ViewGroup){
            for (child in parent.children){
                if (counter%2 == 0){
                    child.setBackgroundColor(ContextCompat.getColor(this,R.color.ibPrimary))
                }else{
                    child.setBackgroundColor(ContextCompat.getColor(this,R.color.ibPrimaryLight))
                }
                interval_layout_active.setViewDraggable(child, child);
                counter++
            }
        }
    }
    override fun onButtonClicked(v: View){
        when(v.id){
            R.id.interval_button_add -> {
                val b = Button(this)
                b.text = TimeHelper.secondsToMinSecString(700)
                interval_layout_active.addView(b)
                refreshLayout(interval_layout_active)
            }
            R.id.interval_button_plus -> {

            }
            R.id.interval_button_minus -> {

            }
        }
    }
}
