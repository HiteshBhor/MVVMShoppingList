package com.hpb.mvvmshoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.hpb.mvvmshoppinglist.data.db.entities.ShoppingItem
import com.hpb.mvvmshoppinglist.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val repository: ShoppingRepository): ViewModel() {

    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems() //It is not inside Coroutine as it is Read only operation.
}