fun main(args: Array<String>){
    val obj=song()
    obj.songName="Khariyat Pucho"
    obj.songSinger="Arijit Sing"
    obj.songDuration=6.32
    obj.songTseries=true

    println(obj.songName)
    println(obj.songSinger)
    println(obj.songDuration)
    println(obj.songTseries)
    val song2=song()
    song2.songName="maine tera name dil rakh diya"
    song2.songSinger="arijit"
    song2.songDuration=4.34
    song2.songTseries=true
    println(song2.songName)
    println(song2.songSinger)
    println(song2.songDuration)
    println(song2.songTseries)
    obj.play()
    obj.stop()
    obj.pause()
}
class song(){

    var songName: String?=null
    var songSinger: String?=null
    var songDuration:Double?=null
    var songTseries:Boolean?=null
    fun play(){
        print("Song is playing ")
    }
    fun stop(){
        print("Song is stopped ")
    }
    fun pause() {
        println("song is paused ")
    }
}