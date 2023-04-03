package com.example.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager

/*private const val TAG = "ActivityDetailsSections"
class ActivityDetailsSectionsAdapter(val listener: ()->(Unit))
    : RecyclerView.Adapter<ActivityDetailsSectionsAdapter.DetailsAndHighlightAdapterVH>() {
    private val expandedPositions = mutableListOf<Boolean>() // we have list of false
    private var previousPosition = RecyclerView.NO_POSITION // to track the last position we clicked
    private var items = arrayListOf<Sections>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailsAndHighlightAdapterVH {
        Log.d(TAG, "onCreateViewHolder: called  ,  expandedPositions:$expandedPositions")
        val binding = ItemDetailsAndHighlightBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DetailsAndHighlightAdapterVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: DetailsAndHighlightAdapterVH, position: Int) {
        Log.d(TAG, "onBindViewHolder: called ,  expandedPositions:$expandedPositions")
        val isExpendable = if (expandedPositions.size > 0) expandedPositions[position] else false
        holder.bind(items[position], isExpendable)
    }

    fun hideDetailForAllItem() {
        expandedPositions.fill(false)
        notifyDataSetChanged()
    }

    fun submitList(sections: List<Sections>?) {
        if (sections == null)
            return
        items = ArrayList(sections)
        expandedPositions.clear()
        expandedPositions.addAll(List(items.size) { false })
        notifyDataSetChanged()

    }

    inner class DetailsAndHighlightAdapterVH(val binding: ItemDetailsAndHighlightBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Sections, isExpanded: Boolean) {
            Log.d(TAG, "bind: called")
            binding.item = item
            binding.isExpandedView = isExpanded

            binding.seeMoreIv.setOnClickListener {

                val transition = AutoTransition()
                transition.duration = 300 // set the duration of the animation in milliseconds

                TransitionManager.beginDelayedTransition(binding.container, transition)

                *//**
                 *  here the main logic , if i have any item extanded then other item will be hide
                 *  we using list of expandedPositions to track the position
                 *//*
                if (expandedPositions.size > absoluteAdapterPosition) {
                    if (previousPosition != absoluteAdapterPosition && previousPosition != RecyclerView.NO_POSITION) {
                        expandedPositions.fill(false) // to set all it value to false
                    }
                    expandedPositions[absoluteAdapterPosition] =
                        !expandedPositions[absoluteAdapterPosition]
                    previousPosition = absoluteAdapterPosition
                }


                *//**
                 *  for the click logic ,
                 *  if we have anyone extanded item then it should hide the other view outside the recycler view items
                 *//*
                if (expandedPositions.contains(true)) {
                    listener.onClick(EnumSectionActivityDetail.SECTIONS, item, position)
                }

                notifyDataSetChanged()
            }

            binding.titleTv.setOnClickListener {
                binding.seeMoreIv.performClick()
            }
        }
    }
}*/
