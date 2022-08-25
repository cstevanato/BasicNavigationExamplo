package com.example.basicnavigationexamplo.ui.details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.basicnavigationexamplo.R
import com.example.basicnavigationexamplo.databinding.FragmentHomeBinding
import com.example.basicnavigationexamplo.databinding.FragmentHomeDatailsBinding

class HomeDatailsFragment : Fragment() {

    companion object {
        fun newInstance() = HomeDatailsFragment()
    }

    private lateinit var viewModel: HomeDatailsViewModel

    private val args: HomeDatailsFragmentArgs by navArgs()


    private var _binding: FragmentHomeDatailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeDatailsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeDatailsViewModel::class.java)
        // TODO: Use the ViewModel

        binding.resultField.text = "Param id: ${args.id}"
    }

}