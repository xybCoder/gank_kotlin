package gank.com.gank_ktolin.utils

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class IoMainScheduler<T> : RxSchedulers<T>(Schedulers.io(), AndroidSchedulers.mainThread())