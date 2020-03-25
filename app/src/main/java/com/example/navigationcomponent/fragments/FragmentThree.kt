package com.example.navigationcomponent.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_three.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentThree : Fragment(),View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_three, container, false)

        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id) { //Check for the id of the view i which click event happened
            R.id.button -> goToNextFragment()
        }
    }

    private fun goToNextFragment() {
        findNavController().navigate(R.id.action_threeFragment_to_DrawerFragmentThree) //navigation
    }

}
