package com.eng.taskcars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DataGlobal.metode.parseCSV(this)

        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide)
        val cardViewBottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_slide)
        val seeAllTextViewAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_slide)
        val downArrowAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_slide)

        welcomeTextView.startAnimation(slideAnimation)
        description.startAnimation(cardViewBottomAnimation)
        seeAllCars.startAnimation(seeAllTextViewAnimation)
        arrowIcon.startAnimation(downArrowAnimation)

        arrowIcon.setOnClickListener {
            startActivity(Intent(this, LogosActivity::class.java))
        }
    }

}