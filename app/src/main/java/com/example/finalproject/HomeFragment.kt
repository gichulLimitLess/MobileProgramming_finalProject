package com.example.finalproject

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: IngerdeintAdapter
    val data:ArrayList<Ingredient> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.recycle
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 21))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 9))
        data.add(Ingredient("당근", 3, 2023, 4, 14, 2023, 5, 30))
        adapter = IngerdeintAdapter(data)
        recyclerView.adapter = adapter

        binding.recycle.apply {
            layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}