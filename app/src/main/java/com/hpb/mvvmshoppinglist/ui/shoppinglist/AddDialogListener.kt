package com.hpb.mvvmshoppinglist.ui.shoppinglist

import com.hpb.mvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}