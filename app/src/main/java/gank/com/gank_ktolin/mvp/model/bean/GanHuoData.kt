package gank.com.gank_ktolin.model.bean

import java.io.Serializable
import java.util.Date

data class GanHuoData(var error: Boolean, var results: List<Gank>) : Serializable {


    data class Gank(var used: Boolean,
                    var type: String,//干货类型，如Android，iOS，福利等
                    var url: String,//链接地址
                    var who: String,//作者
                    var desc: String,//干货内容的描述
                    var updatedAt: Date,
                    var createdAt: Date,
                    var publishedAt: Date)
}