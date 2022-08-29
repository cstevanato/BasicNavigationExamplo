package com.example.basicnavigationexamplo.ui.v1.defaultflow2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.basicnavigationexamplo.databinding.FragmentFlowScreen2Binding

class FlowScreen2Fragment : Fragment() {

    private var _binding: FragmentFlowScreen2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(FlowScreen2ViewModel::class.java)

        _binding = FragmentFlowScreen2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        binding.btnGotoBegin.setOnClickListener {
            val directions = FlowScreen2FragmentDirections.actionNavGalleryToNavHome()
            it.findNavController().navigate(directions = directions)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}