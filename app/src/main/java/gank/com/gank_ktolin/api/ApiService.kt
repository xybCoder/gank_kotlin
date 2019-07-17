package gank.com.gank_ktolin.api

import gank.com.gank_ktolin.model.bean.GanHuoData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    //请求不同类型干货（通用）
    @GET("data/{type}/{pageSize}/{page}")
    fun getGanHuoData(@Path("type") type: String,@Path("pageSize") pageSize: Int, @Path("page") page: Int): Observable<GanHuoData>
}