package com.runitrut.ruts_fragment_reference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.runitrut.ruts_fragment_reference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /* FIRST for fragments,
    *  Create a new FILE in either the java/kotlin package OR
    *  Create a new FILE in the LAYOUT package folder, then...
    *  the corresponding java/kotlin file or LAYOUT activity will be created AUTOMATICALLY
    *  SECOND step in NewsFragment kt file
    *  THIRD is to create a FragmentContainerView in the XML ACTIVITY that's gonna host all the fragments
    **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* create local values representative of their CORRESPONDING java/KT file/class */
        val newsFragment = NewsFragment()
        val sportsFragment = SportsFragment()
        val scienceFragment = ScienceFragment()

        // FIRST you create the FRAGMENT CONTAINER VIEW that will HOST/CONTAIN/HOLD a single fragment, one at a time
        // IN this case, its the FRAGMENT CONTAINER VIEW  in the corresponding activity_main.xml AND MainActivity.kt ; called...
        // : <androidx.fragment.app.FragmentContainerView/>...
        // with an ID of....android:id="@+id/fragmentContainerView

        // SECONDLY set the XML NAME ATTRIBUTE of the <androidx.fragment.app.FragmentContainerView/>
        // to the fragment YOU wish to start with....or

        // ..........OR..........OR..........OR..........OR

        // Programmatically set the starting fragment in the FRAGMENT CONTAINER: example below
        // VVVVVVVVVVVVVVV  HERE  VVVVVVVVVVVVVVVVVVVVV
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fragmentContainerView, newsFragment)
//            commit()
//        }

        binding.btnNews.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, newsFragment)
                commit()
            }
        }

        binding.btnSports.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, sportsFragment)
                commit()
            }
        }

        binding.btnScience.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, scienceFragment)
                commit()
            }
        }

    }
}