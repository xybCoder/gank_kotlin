package gank.com.gank_ktolin.base
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import gank.com.gank_ktolin.widget.MultipleStatusView

abstract class BaseActivity : AppCompatActivity() {

    protected var mLayoutStatusView: MultipleStatusView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutId())
        initData()
        initView()
        request()
        initListener()
    }


    abstract fun request()

    private fun initListener() {

        //if not null 简写
        mLayoutStatusView?.setOnRetryClickListener(mRetryClickListener)
    }


    // 在kotlin中默认所有的方法和类都是final属性 可以指定open 可以被覆写
    open val mRetryClickListener: View.OnClickListener = View.OnClickListener {
        request()
    }

   open  fun initView() {

    }

    private fun initData() {

    }

    abstract fun layoutId(): Int

}