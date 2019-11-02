package com.sematec.sematecandroidadvancedmehr98.features.mvp

class TestPresenter(private val view: MVPContract.View) : MVPContract.Presenter {


    override fun onSaveButtonClicked() {
        view.showToast("You have clicked on save btn")
    }

    private val model = TestModel(this)

    override fun getAllNames() {
        model.fetchAllNames()
    }

    override fun onNamesReceived(list: List<String>) {
        view.onNamesReceived(list)
    }
}