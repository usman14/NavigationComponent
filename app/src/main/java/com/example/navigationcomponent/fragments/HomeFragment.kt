package com.example.navigationcomponent.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(), View.OnClickListener { //OnClickListener

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController() //Initialising navController

        //Initialising button click event listener
        home_next_frag_btn.setOnClickListener(this)
        (activity as AppCompatActivity?)!!.supportActionBar!!.setHomeButtonEnabled(false);
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(false);

    }

    override fun onClick(v: View?) { //When click occurs this function is triggered
        when (v!!.id) { //Check for the id of the view i which click event happened
            R.id.home_next_frag_btn -> goToNextFragment()
        }
    }

    private fun goToNextFragment() {
        navController.navigate(R.id.action_homeFragment_to_profileFragment) //navigation
    }

}
