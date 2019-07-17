package gank.com.gank_ktolin.mvp.presenter

import gank.com.gank_ktolin.base.BasePresenter
import gank.com.gank_ktolin.mvp.contract.GanHuoContract

class GanHuoPresenter :BasePresenter<GanHuoContract.View>(),GanHuoContract.Presenter{
    override fun getGanHuoList(id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadMoreData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}