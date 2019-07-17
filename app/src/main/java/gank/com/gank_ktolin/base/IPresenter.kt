package gank.com.gank_ktolin.base

interface IPresenter<in V: IBaseView> {

    fun attachView(mRootView: V)

    fun detachView()

}