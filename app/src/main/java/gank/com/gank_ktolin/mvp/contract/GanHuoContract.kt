package gank.com.gank_ktolin.mvp.contract

import gank.com.gank_ktolin.base.IBaseView
import gank.com.gank_ktolin.base.IPresenter
import gank.com.gank_ktolin.model.bean.GanHuoData

interface GanHuoContract {

    interface View: IBaseView {
        /**
         *  设置列表数据
         */
        fun setGanHuoList(itemList:ArrayList<GanHuoData.Gank>)

        fun showError(errorMsg:String)




    }

    interface Presenter: IPresenter<View> {

        fun getGanHuoList(id:Long)

        fun loadMoreData()
    }
}