package gank.com.gank_ktolin.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import gank.com.gank_ktolin.R
import gank.com.gank_ktolin.base.BaseFragment


class HomeFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }


    companion object {
        fun newInstance(type: Int): HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            bundle.putInt("type", type)
            fragment.arguments = bundle
            return fragment
        }
    }


}
