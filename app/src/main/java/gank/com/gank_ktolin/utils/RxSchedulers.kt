package gank.com.gank_ktolin.utils
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.ObservableTransformer
import io.reactivex.Scheduler


abstract class RxSchedulers<T>  constructor(private val subscribeOnScheduler: Scheduler,
                                private val observeOnScheduler: Scheduler): ObservableTransformer<T, T> {
    override fun apply(upstream: Observable<T>): ObservableSource<T> {
        return upstream.subscribeOn(subscribeOnScheduler)
                .observeOn(observeOnScheduler)
    }

}