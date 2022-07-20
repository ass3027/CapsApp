package com.example.cap.ui.deliveryList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cap.databinding.FragmentDeliveryListBinding
import androidx.lifecycle.ViewModelProvider

class DeliveryListFragment : Fragment() {

    private var _binding: FragmentDeliveryListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
                ViewModelProvider(this).get(DeliveryListViewModel::class.java)

        _binding = FragmentDeliveryListBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textDashboard
//        dashboardViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}