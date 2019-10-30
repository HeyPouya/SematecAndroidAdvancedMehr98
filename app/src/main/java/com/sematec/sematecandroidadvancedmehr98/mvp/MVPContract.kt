package com.sematec.sematecandroidadvancedmehr98.mvp

interface MVPContract {


    interface View {
        fun onNamesReceived(namesList: List<String>)
        fun setUpRecyclerView()
        fun showToast(message : String)
    }

    interface Presenter {
        fun getAllNames()
        fun onNamesReceived(list: List<String>)
        fun onSaveButtonClicked()
    }
}