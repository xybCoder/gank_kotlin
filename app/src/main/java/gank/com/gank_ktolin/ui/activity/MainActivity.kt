package gank.com.gank_ktolin.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import gank.com.gank_ktolin.R
import gank.com.gank_ktolin.base.BaseActivity
import gank.com.gank_ktolin.ui.fragment.HomeFragment
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import gank.com.gank_ktolin.base.BaseFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_toolbar_with_indicator.*


class MainActivity : BaseActivity() {

    private var mTitles = arrayListOf("Android","iOS","前端","瞎推荐","拓展资源","App")
    private var mFragmentList: List<Fragment> = ArrayList()

    //默认为0
    private var mIndex = 0

    override fun initView() {
        mFragmentList to HomeFragment()
        mFragmentList to HomeFragment()
        mFragmentList to HomeFragment()
        mFragmentList to HomeFragment()
        mFragmentList to HomeFragment()
        val pagerAdapter =  BaseFragmentAdapter(supportFragmentManager,mFragmentList,mTitles)
        container.setAdapter(pagerAdapter)
        container.setOffscreenPageLimit(5)
        tab_layout.setTabMode(TabLayout.MODE_SCROLLABLE)
        tab_layout.setupWithViewPager(container)

    }

    override fun request() {

    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            mIndex = savedInstanceState.getInt("currTabIndex")
        }
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingSuperCall")
    override fun onSaveInstanceState(outState: Bundle) {
        //记录fragment的位置,防止崩溃 activity被系统回收时，fragment错乱

        outState.putInt("currTabIndex", mIndex)

    }


    private var mExitTime: Long = 0

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis().minus(mExitTime) <= 2000) {
                finish()
            } else {
                mExitTime = System.currentTimeMillis()
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT)
            }
            return true
        }
        return super.onKeyDown(keyCode, event)
    }


}
