package com.kingOf0.askit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.kingOf0.askit.core.utilities.results.DataResult
import com.kingOf0.askit.databinding.FragmentHomepageBinding
import com.kingOf0.askit.model.Message
import com.kingOf0.askit.network.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomepageFragment : Fragment() {

    private lateinit var binding: FragmentHomepageBinding

    var bookList = arrayListOf<Message>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomepageBinding.inflate(layoutInflater)

        getMessageList()
        return binding.root
    }

    private fun getMessageList() {
        ApiUtils.getMessageDAO().getMessages().enqueue(
            object : Callback<DataResult<List<Message>>> {
                override fun onResponse(
                    call: Call<DataResult<List<Message>>>,
                    response: Response<DataResult<List<Message>>>
                ) {
                    response.body()?.data?.let {
                        bookList = it as ArrayList<Message>
                    }

                    val adapter = MessageAdapter(bookList)
                    val recyclerView = binding.messageRecyclerView
                    recyclerView.adapter = adapter
                    recyclerView.layoutManager = GridLayoutManager(context, 1)
                    recyclerView.setHasFixedSize(true)
                }

                override fun onFailure(call: Call<DataResult<List<Message>>>, t: Throwable) {
                    t.printStackTrace()
                }
            }
        )
    }
}