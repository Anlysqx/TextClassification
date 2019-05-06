# TextClassification
## 数据分析    
### 从原始数据中读取一共有2768827条数据
### 共24个类别  
### 每个类别包含的条数 

phone : 641039  
weather : 615327  
home : 486345  
music : 311508  
translation : 306456  
audio : 135989  
playcontrol : 100634  
volume : 52338  
FM : 39987  
limitLine : 22637  
alarm : 18909  
schedule : 13443  
story : 11963  
movie : 6460  
listenBook : 1763  
variety : 1442  
serial : 1001  
news : 733  
collect : 543  
IREADER : 201  
shengyin : 53  
musicinfo : 53  
cartoon : 2  
discover : 1  
 
### 对每个类别的解释  
phone : 控制通话操作,拨电话,接通来电等  
weather : 查询天气  
home : 各种控制命令,打开,关闭  
music : 播放歌曲  
translation : 翻译功能,混入了很多今天天气的脏数据  
audio : 很多动物怎么叫,混入了很多播放相声和播放关于...的故事的脏数据  
playcontrol : 播放控制,关机,播放,暂停等  
volume : 音量控制  
FM : 广播控制,混入了很多播放音乐music类的内容  
limitLine : 交通尾号限停  
alarm : 定闹钟操作  
schedule : 日程操作,混入闹钟脏数据  
story : 听故事,混入儿歌,歌曲脏数据  
movie : 看电影,混入了story,music等脏数据  
listenBook : 听小说,混入story,歌曲等脏数据  
variety : 多样的,几乎全是不确定的music播放,和music难区分开来,通过泛指词区分  
serial : 电视连续剧; 广播连续剧,和movie,FM难区分  
news : 新闻,较干净  
collect : 喜欢收藏歌曲,和home,music容易混  
IREADER : 掌阅相关,用于读小说,和story,music都容易混  
shengyin : 声音,和audio混合度很高,很多动物怎么叫  
musicinfo : 歌曲信息,这首歌谁唱的,这首歌是什么歌  
cartoon : 2 数据很少,播放动画片  
discover : 1 就一条,发现智能设备  
  
### 数据去重后
### 数据量大大地降下来了:从276万下降到26万，其中一个类别cartoon消失了，归并到了music里面  
一共261987条数据  
一共23个类别  
music : 135177  
phone : 53014  
audio : 13410  
playcontrol : 10457  
FM : 9869  
weather : 8095  
alarm : 8091  
translation : 7034  
volume : 6526  
home : 3736  
schedule : 2835  
story : 1778  
movie : 921  
news : 334  
collect : 158  
variety : 152  
limitLine : 145  
serial : 121  
listenBook : 66  
IREADER : 38  
shengyin : 15  
musicinfo : 14  
discover : 1   
