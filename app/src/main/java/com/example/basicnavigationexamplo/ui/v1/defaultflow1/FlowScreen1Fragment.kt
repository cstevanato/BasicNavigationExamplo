package com.example.basicnavigationexamplo.ui.v1.defaultflow1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.basicnavigationexamplo.databinding.FragmentFlowScreen1Binding

class FlowScreen1Fragment : Fragment() {

    companion object {
        fun newInstance() = FlowScreen1Fragment()
    }

    private lateinit var viewModel: FlowScreen1ViewModel

    private val args: FlowScreen1FragmentArgs by navArgs()


    private var _binding: FragmentFlowScreen1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFlowScreen1Binding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[FlowScreen1ViewModel::class.java]
        // TODO: Use the ViewModel

        binding.resultField.text = "Param id: ${args.id}"


        binding.btnNextStep.setOnClickListener {
            val directions = FlowScreen1FragmentDirections.actionNavHomeDetailToNavGallery()
            it.findNavController().navigate(directions = directions)
        }

        binding.btnBackStep.setOnClickListener {
            it.findNavController().popBackStack()
        }
    }

}