package com.lkm.spider;

public class Constant {
    private final String[] finish = {"孔子", "莎士比亚", "列夫·托尔斯泰", "李清照", "鲁迅", "安徒生"};
    private final String[] name = {"孔子", "莎士比亚", "列夫·托尔斯泰", "李清照", "鲁迅", "安徒生", "普希金", "狄更斯", "乔伊斯", "马克吐温"};
    private final String[] dsj = {"王次", "王巨宣", "孙宗", "卫改", "戴逵", "戴颙", "雷卑石", "僧佑", "道凭", "司马达", "张寿", "李春", "窦弘果", "方辨", "杨惠之", "王温", "刘九郎",
            "安生", "李岫", "张文昱", "盖忠", "严氏", "介端", "文惟简", "袁遇昌", "伏元俊", "胥安", "田玘", "董晖", "阿僧哥", "阿尼哥", "刘元", "杨文昭", "范道生", "工布查布", "黎广修", "张长林"};
    private final String[] jzj = {"鲁班", "宇文恺", "喻皓", "李诫", "蒯祥", "雷发达", "梁九", "吕彦直", "梁思成", "阎立德", "刘秉忠", "贺盛瑞", "计成", "山子张", "样式雷"};
    private final String[] wdj = {"西施", "邯郸姬", "戚夫人", "李夫人", "王翁须", "赵飞燕", "华容夫人", "唐姬", "制氏", "冯肃", "翔凤", "绿珠", "章丹", "谢尚", "潘妃", "孙荆玉",
            "张静婉", "张丽华", "谢阿蛮", "安叱奴", "张云容", "悖拏儿", "公孙大娘", "李十二娘", "李可及", "萧炼师", "崇胡子", "商玲珑", "杜红儿", "关盼盼", "江采苹", "太平公主", "安禄山", "杨玉环", "裴旻",
            "沈阿翘", "灼灼", "转转", "周娥皇", "窅娘", "雷中庆", "小英", "李师师", "凤翔老尼", "菊夫人", "张遇喜", "谢兴歌", "琼琼", "杜士康", "吴兴佑", "刘良佐", "范宗茂", "豪俊迈", "豪士英", "凝香儿",
            "顺时秀", "连枝秀", "魏道道", "赛天香", "一分儿", "妙乐奴", "三圣奴", "朱帘秀", "染园秀", "事事宜", "樊香歌", "刘婆惜", "玉莲儿", "张小娥", "朱载堉", "张忆娘", "蒋翠羽", "汪青锁", "珠娘", "梅崇阿", "裕容龄"};
    private final String[] xjj = {"孟元老", "周密", "吴自牧", "黄可道", "关汉卿", "白朴", "马致远", "王实甫", "柯丹丘", "高文秀", "郑廷玉", "纪君祥", "康进之", "杨显之", "尚仲贤", "王仲文", "王伯成", "孔文卿", "石子章", "石君宝", "史九敬先",
            "红字李二", "孙仲章", "花李郎", "李文蔚", "李好古", "李寿卿", "李时中", "李直夫", "李致远", "李潜夫", "吴昌龄", "狄君厚", "张寿卿", "张国宾",
            "武汉臣", "范居中", "岳伯川", "孟汉卿", "姚守中", "费君祥", "庾天锡", "粱进之", "戴善甫", "朱帘秀", "天然秀", "天锡秀", "平阳奴", "杨梓", "金仁杰", "周文质", "郑光祖", "宫天挺", "范康",
            "乔吉", "秦简夫", "费唐臣", "萧德祥", "朱锦秀", "顺时秀", "赛帘秀", "王晔", "朱凯", "屈恭之", "睢景臣", "汪元亨", "顾坚", "顾山山", "邓聚德", "刘唐卿",
            "李取进", "吴弘道", "沈和", "陈以仁", "赵文敬", "赵天锡", "赵明道", "赵善庆", "侯克中", "施惠", "袁伯威", "顾仲清", "鲍天佑", "王子一", "刘东生",
            "刘君锡", "苏复之", "李唐宾", "李景云", "杨讷", "杨文奎", "谷子敬", "张择", "夏庭芝", "徐(田臣)zhen", "高则诚", "高茂卿", "陶宗仪",
            "黄元吉", "曾瑞", "詹时雨", "汤舜民", "罗贯中", "贾仲明", "朱有燉", "兰茂", "丘濬", "徐霖", "阿丑", "陈沂", "王九思", "康海",
            "陈铎", "杨慎", "姚茂良", "沈采", "邵灿", "陆采", "王济", "何良俊", "崔时佩", "李日华", "冯惟敏", "谢谠", "徐渭", "梁辰鱼", "高濂", "汪道昆", "莲池",
            "王世贞", "陈所闻", "周全", "颜容", "李贽", "张凤翼", "史槃", "沈璟", "王穉登", "顾大典", "陈与郊", "汤显祖", "梅鼎祚", "臧懋循", "潘之恒", "吴世美",
            "孙柚", "张四维", "徐复祚", "王衡", "赵琦美", "刘还初", "郑之珍", "周朝俊", "朱鼎", "汪廷讷", "薛近兖", "胡文焕", "谢天瑞", "杨珽", "徐元", "湛然", "郑之玄",
            "纪振伦", "朱期", "许自昌", "谢廷谅", "郑之文", "周履靖", "王澹", "茅维", "高一苇", "卜世臣", "更生子", "智达", "沈季彪", "王国柱", "汪宗姬", "金怀玉", "王玉峰",
            "程士廉", "杨之炯", "徐阳辉", "邓志谟", "顾觉宇", "孙钟龄", "黄方胤", "桑绍良", "郑若庸", "陈罴斋", "沈龄", "王鈴", "许潮", "陈汝元", "车任远", "沈鲸", "单本",
            "李逢时", "王骥德", "叶宪祖", "冯梦龙", "沈德符", "吕天成", "凌濛初", "沈自晋", "阮大铖", "范文若", "沈自徵", "韩上桂", "张龙文", "吴炳", "孙源文", "孟称舜",
            "佘翘", "朱葵心", "朱寄林", "李素甫", "张楚叔", "徐应乾", "陈一球 ", "叶小纨", "王元寿", "王无功", "王光鲁", "王应遴", "黄家舒", "研雪子", "秦之鉴", "傅一臣",
            "范世彦", "朱京藩", "谢国", "沈嵊", "硕园", "清啸生", "西湖居士", "朱九经", "石子斐", "邹玉卿", "马锦", "卜不矜", "陆世廉", "姚子翼", "邹式金", "邹兑金", "卓人月",
            "朱楚生", "徐紫云", "高小玲", "袁天锡", "李玉", "袁于令", "毛晋", "来镕", "路迪", "叶承宗", "查继佐", "祁彪佳", "王翃", "傅山", "金圣叹", "吴伟业", "李渔", "黄周星",
            "余怀", "丘园", "尤侗", "王夫之", "沈谦", "叶奕苞", "范希哲", "盛际时", "高奕", "张大复", "毕魏", "朱素臣", "朱佐朝", "叶稚斐", "王抃", "钱曾", "嵇永仁", "蒲松龄",
            "廖燕", "裘琏", "洪昇", "孔尚任", "顾彩", "吴德修", "曹寅", "陈明智", "龙燮", "周稚廉", "万树", "沈玉亮", "张雍敬", "东江英", "黄之隽", "岳端", "孔传", "夏纶",
            "张坚", "唐英", "张照", "厉鹗", "吴震生", "吴城", "黄图珌", "宋廷魁", "金德英", "董榕", "杨潮观", "金兆燕", "张九钺", "南山逸史", "吕星垣 ", "汪应培", "沈懋德",
            "汪柱", "徐士俊", "郑瑜", "石庞", "王墅", "汪光被", "吴士科", "张韬", "李应桂", "许逸", "沈君谟", "朱云从", "周杲", "薛旦", "刘方", "陈二白", "马佶人", "徐石麟",
            "卢见曾", "石琰", "周书 ", "朱乔", "高宗元", "吴镐", "许名仑", "黄兆魁", "刘八", "黄振", "徐大椿", "韩锡胙", "蒋士铨", "夏秉衡", "曹锡黼", "王文治", "方成培",
            "徐爔", "李调元", "桂馥", "黄文旸", "钱惟乔", "沈起凤", "永恩", "金德辉", "郑振图", "周昂", "廖景文", "敦诚", "陈云九", "郝天秀", "陈钟麟", "魏长生", "孔广林",
            "黎简", "仲振奎", "申祥麟", "李斗", "石韫玉", "许鸿磐", "焦循", "陈栋", "舒位", "查揆", "陆继辂", "高朗亭", "朱凤森", "汤贻汾", "米喜子", "周乐清", "严廷中",
            "余三胜", "梁廷柟", "严保庸", "小天喜", "林仰乐", "吴藻", "黄治", "张声玠", "李文瀚", "姚燮", "黄燮清", "余治",};

    private final String[] wxj = {
            "老子", "孔子", "孟子", "荀子", "庄子", "屈原", "宋玉", "张华", "贾谊", "司马相如", "枚乘", "东方朔", "扬雄", "司马迁", "刘向", "班固", "张衡", "孔融", "曹操", "蔡琰", "王粲", "曹丕", "曹植", "阮籍", "嵇康", "潘岳", "傅玄", "左思", "张协", "陆机", "刘琨", "郭璞", "干宝", "葛洪", "王嘉", "陶渊明", "颜延之", "谢灵运", "刘义庆", "鲍照", "江淹", "谢朓", "钟嵘", "刘勰", "吴均", "殷芸", "徐陵", "庾信", "建安七子", "竹林七贤", "三张二陆两潘一左", "鲍谢", "元嘉三大家", "竟陵八友", "卢思道", "薛道衡", "杨素", "王绩", "上官仪", "卢照邻", "骆宾王", "杜审言", "苏味道", "王勃", "杨炯", "刘希夷", "沈佺期", "宋之问", "贺知章", "张若虚", "陈子昂", "李峤", "张九龄", "王之焕", "孟浩然", "李颀", "王昌龄", "王维", "李白", "高适", "崔颢", "储光羲", "常建", "刘长卿", "杜甫", "岑参", "元结", "韩翃", "钱起", "顾况", "张志和", "戴叔伦", "韦应物", "李益", "韩愈", "沈既济", "白居易", "李公佐", "刘禹锡", "柳宗元", "李谅", "白行简", "元稹", "牛僧孺", "李德裕", "蒋防", "柳珵", "李贺", "杜牧", "李商隐", "温庭筠", "卢肇", "裴铏", "孟棨", "罗隐", "韦庄", "司空图", "韩偓", "陆龟蒙", "冯延巳", "徐铉", "乐史", "崔公度", "王鼎", "李煜", "柳开", "王禹偁", "林逋", "柳永", "范仲淹", "张先", "晏殊", "尹洙", "梅尧臣", "欧阳修", "苏洵", "朱弁", "曾巩", "王安石", "洪迈", "晏几道", "沈括", "苏轼", "苏辙", "黄庭坚", "秦观", "贺铸", "陈师道", "晁补之", "周邦彦", "叶梦得", "朱淑真", "李清照", "陈与义", "张元幹", "陆游", "范成大", "尤袤", "杨万里", "张孝祥", "辛弃疾", "姜夔", "吴文英", "元好问", "周密", "文天祥", "张炎", "严羽", "蒋捷", "汪元量", "关汉卿", "白朴", "马致远", "郑光祖", "王实甫", "高明", "段成己", "张养浩", "杨瑀", "张可久", "萨都刺", "雎景臣", "纪君祥", "董解元", "瞿佑", "皎然", "寒山", "初唐四杰", "文章四友", "韩孟诗派", "郊寒岛瘦", "大历十才子", "宋濂", "刘基", "施耐庵", "罗贯中", "高启", "方孝孺", "朱权", "朱有燉", "李东阳", "王九思", "唐寅", "李梦阳", "何景明", "吴承恩", "兰陵笑笑生", "李开先", "归有光", "李攀龙", "梁辰鱼", "徐渭", "王世贞", "李贽", "汤显祖", "胡应麟", "沈璟", "袁宏道", "钟惺", "冯梦龙", "凌濛初", "张岱", "张溥", "吴中四杰", "前七子", "后七子", "钱谦益", "李玉", "金人瑞", "吴伟业", "黄宗羲", "李渔", "顾炎武", "尤侗", "侯方域", "王夫之", "李昌祺", "陆粲", "陆延枝", "谢肇淛", "王崇简", "周亮工", "李调元", "和邦额", "沈起凤", "朱翊清", "张际亮", "潘纶恩", "俞樾", "王韬", "汪琬", "魏禧", "陈维崧", "朱彝尊", "王士祯", "蒲松龄", "洪昇", "孔尚任", "纳兰性德", "方苞", "沈德潜", "郑燮", "刘大櫆", "吴敬梓", "毛宗岗", "曹雪芹", "袁枚", "纪昀", "蒋士铨", "赵翼", "姚鼐", "高鹗", "汪中", "李汝珍", "龚自珍", "魏源", "姚燮", "吴汝纶", "黄遵宪", "林纾", "严复", "刘鹗", "康有为", "丘逢甲", "谭嗣同", "李宝嘉", "章太炎", "曾朴", "梁启超", "王国维", "秋瑾", "苏曼殊", "柳亚子", "江左三大家", "姚门四杰", "近代四大词人"};
    private final String[] yyj = {"许由", "汤", "师延", "周文王", "周武王", "周公", "尹吉甫", "伶州鸠", "苌弘", "师涓", "师襄", "孔子", "师旷  ", "荣启期", "闵子骞", "子路  ", "曾子", "介之推", "卫灵公", "王豹", "绵驹", "伯牙", "钟仪", "邹忌", "雍门周", "高渐离", "秦青", "薛谭", "韩娥", "庄子", "列子", "宋玉", "楚商梁", "瓠巴", "师文", "师经", "谢涓子", "刘涓子", "文馨", "刘安", "师中", "赵定", "司马相如", "李延年", "京房", "刘向", "王昭君", "扬雄", "桓谭", "马融", "蔡邕", "阮瑀", "蔡琰", "陈修明", "杜夔", "邓静", "尹商", "尹胡", "左延年", "嵇康", "袁准", "阮籍", "荀勖", "左思", "刘琨", "列和", "阮咸", "桓伊", "麴瞻", "何承天", "宗炳", "戴颙", "钱乐之", "陈仲孺", "祖莹", "祖珽", "安马驹", "安未弱", "苏祗婆", "柳世隆", "王僧虔", "萧衍", "丘公", "郑译", "曹妙达", "王通", "贺若弼", "李疑", "万宝常", "赵耶利", "祖孝孙", "白明达", "吕才", "张文收", "裴神符", "司马承祯", "李隆基", "董庭兰", "王维", "何满子", "许和子", "杨收", "石荆山", "李勉", "刘商", "李龟年", "雷海青", "李谟", "薛易简", "康昆仑", "独孤及", "李琬", "陈康士", "吕渭", "段善本", "曹善才", "曹刚", "雷威", "文溆", "贺若存", "王敬璈", "陈拙", "王朴", "黄延矩", "赵匡义", "崔遵度", "朱亿", "沈括", "陈旸", "朱长文", "知白", "义海", "朱文济", "成玉", "沈遵", "吴良辅", "文照", "石汝砺", "赵希旷", "蔡元定", "姜夔", "徐宇", "杨瓒", "徐理", "毛敏仲", "刘志方", "汪元亮", "张岩", "郭沔", "朱熹", "张炎", "董解元", "苗秀实", "周德清", "耶律楚材", "贯云石", "倪瓒", "宋尹文", "徐和仲", "冷谦", "汪芝", "朱权", "黄献", "萧鸾", "李开先", "李近楼", "朱载堉", "张野塘", "屠隆", "蒋克谦", "沈音", "张大命", "杨表正", "杨抡", "顿仁", "石国桢", "张敬修", "严澂", "林有麟", "李之藻", "虞汝明", "夏树芳", "刘珠", "魏良辅", "贾凫西", "陈大斌", "张雄", "汤应曾", "钟秀之", "查八十", "陶鸿逵", "徐上瀛", "金琼阶", "张岱", "尹尔韬", "邝露", "文震亨", "韩畕", "毛奇龄", "庄臻凤", "蒋兴俦", "云志高", "王善", "徐常遇", "李光塽", "孔兴诱", "程允基", "郭裕斋", "汪绂", "李郊", "曹尚炯", "叶布", "崔应阶", "周显祖", "吴景伯", "徐养源", "沈浩", "邱之稑", "黄景星", "陈幼慈", "黄晓山", "唐彝铭", "庆瑞", "空尘", "清谼子", "觉庵", "陈世骥", "张春圃", "王坦", "程雄", "徐祺", "徐麟", "金陶", "程瑶田", "张孔山", "吴灴", "叶堂", "杨廷果", "韩桂", "戴长庚", "华秋萍", "蒋文勋", "秦维瀚", "祝凤喈", "徐胪先", "李芳园", "严老烈", "黄勉之", "刘鹗"};
    private final String[] sfj = {"书法家", "仓颉", "史籀", "孔丘", "李斯", "赵高", "胡毋敬", "程邈", "王次仲", "萧何", "李陵", "张敞", "史游", "陈遵", "许慎", "孙敬", "刘炟", "班固", "曹喜", "杜度", "仇靖", "仇绋", "崔瑗", "左伯", "纪伯允", "史晨", "师宜官", "徐幹", "朱登", "皇甫规妻", "刘德升", "唐综", "刘盛息", "张芝", "张超", "张昶", "张彭祖", "罗晖", "田彦和", "赵袭", "蔡琰", "蔡邕", "梁鹄", "胡昭", "曹操", "诸葛亮", "钟繇", "宋翼", "邯郸淳", "张昭", "张纮", "张宏", "苏建", "贺邵", "韦诞", "刘廙（yi）", "卫觊", "皇象", "钟会", "卫瓘", "卫恒", "卫臻", "山涛", "杜预", "张华", "王戎", "司马炎", "索靖", "孙皓", "司马攸", "王衍", "陆机", "陆云", "王敦", "郗鉴", "卫铄", "王廙", "王导", "王旷", "王劭", "卢谌", "葛洪", "庾亮", "庾翼", "谢尚", "王濛", "王荟", "王廞", "王邃", "张翼", "刘超", "成公绥", "桓温", "郗愔", "王恬", "王羲之", "王洽", "任靖", "谢安", "郗夫人", "谢万", "沈嘉", "杨羲", "王修", "郗超", "王玄之", "王操之", "王徽之", "王凝之", "王献之", "刘環之", "戴逵", "王珣", "王珉", "刘穆之", "崔宏", "刘裕", "孔琳之", "桓玄", "羊欣", "谢灵运", "王昙首", "崔浩", "萧思话", "薄绍之", "刘义隆", "谢庄", "刘彧", "虞龢", "王愔", "王僧虔", "王筠", "萧道成", "萧显庆", "沈约", "范怀约", "王慈", "郑道昭", "萧确", "陶弘景", "智永", "萧子良", "袁昂", "谢朓", "萧衍", "萧锋", "萧子云", "庾肩吾", "颜协", "萧纲", "唐怀充", "满骞", "庾元威", "徐僧权", "殷钧", "丁觇", "王志", "阮研", "贝义渊", "寇谦之", "江式", "朱义章", "王远", "赵文渊", "王褒", "蔡景历", "顾野王", "毛喜", "陈叔慎", "陈伯智", "杨素", "丁道护", "欧阳询", "史陵", "虞世南", "房彦谦", "赵孝逸", "智果", "褚遂良", "李世民", "李治", "怀仁", "殷令民", "薛纯陀", "裴行俭", "武曌", "敬客", "冯承素", "赵模", "李怀琳", "王行满", "高正臣", "孙过庭", "薛稷", "陆柬之", "欧阳通", "薛曜", "陆彦远", "王方庆", "宋儋", "王知敬", "李嗣真", "卢藏用",
            "贺知章", "钟绍京", "韦续", "房高氏", "苏灵芝", "张九龄", "李邕", "郭谦光", "韩择木", "魏栖梧", "张廷珪", "李含光", "李隆基", "大雅", "唐元度", "张怀瓘", "张从申", "蔡希综", "蔡有邻", "吕向", "韦陟", "史惟则", "李阳冰", "徐峤之", "瞿令问", "李白", "徐浩", "徐璹", "郑虔", "颜真卿", "李潮", "窦蒙", "窦臮", "怀素", "吴通微", "陈惟玉", "林韫", "林藻", "张彦远", "邬彤", "韩方明", "沈传师", "柳公权", "柳公绰", "顾况", "李德裕", "杜牧", "高闲", "裴休", "张旭", "卢携", "贯休", "亚栖", "杨凝式", "陆希声", "䛒光", "钱俶", "徐铉", "徐锴", "李煜", "陈抟", "王文秉", "李建中", "郭忠恕", "王著", "钱易", "林逋", "杜衍", "范仲淹", "宋绶", "周越", "石延年", "尹熙古", "章友直", "文彦博", "欧阳修", "苏舜钦", "韩琦 ", "蔡襄", "王安石", "沈辽", "王巩", "苏轼", "朱长文", "黄庭坚", "吕嘉问", "蔡京", "王诜", "章惇", "米芾", "李时雍", "蔡卞", "刘次庄", "石苍舒", "胡安国", "曾纡", "叶梦得", "薛绍彭", "黄伯思", "赵明诚", "赵佶", "米友仁", "岳飞", "薛尚功", "赵构", "洪适", "邵䶵", "雷简夫", "陆游", "范成大", "朱熹", "张孝祥",
            "杨无咎", "吴琚", "吴说", "娄机", "党怀英", "姜夔", "王庭筠", "赵秉文", "胡沂", "魏了翁", "岳珂", "张即之", "张舜民", "葛长庚", "赵孟坚", "赵沨", "郝史", "张天锡", "郝天祜", "龙岩", "鲜于枢", "程钜夫", "赵孟頫", "冯子振", "邓文原", "仇远", "管道昇", "李溥光", "袁桷", "柳贯", "虞集", "吾衍", "揭傒斯", "张雨", "钱良佑", "郭畀", "吴镇", "欧阳玄", "赵雍", "柯九思", "陆友", "康里巎巎/康里巙巙", "杨维桢", "周伯琦", "吴叡", "刘有定", "陈绎曾", "郑杓", "饶介", "倪瓒", "盛熙明", "危素", "泰不华", "詹希元", "陶宗仪", "俞和", "宋濂", "张羽", "宋克", "陈璧", "姚广孝", "张绅", "宋璲", "宋广", "沈度", "沈粲", "杨士奇", "程南云", "解缙", "朱瞻基", "聂大年", "徐有贞", "姜立纲", "张弼", "沈周", "陈献章", "李应祯", "吴宽", "李东阳", "王鏊",
            "邵宝", "祝允明", "唐寅", "文征明", "王守仁", "陆深", "陈淳", "蔡羽", "杨慎", "王宠", "丰坊", "王问", "文彭", "王毂祥", "文嘉", "莫如忠", "黄姬水", "周天球", "徐渭", "王世贞", "詹景凤", "王穉登", "莫是龙", "张凤翼", "邢侗", "董其昌", "邢慈静", "陈继儒", "赵宧光", "李日华", "娄坚", "米万钟", "张瑞图", "归昌世", "宋珏", "黄道周", "刘珏", "王铎", "王时敏", "倪元璐", "担当", "傅山", "冒襄", "周亮工", "查士标", "宋曹", "郑簠", "朱耷", "冯武", "姜宸英", "朱彝尊", "米汉雯", "王鸿绪", "陈奕禧", "爱新觉罗·玄烨", "万经", "何焯", "顾蔼吉", "王澍", "高凤翰", "李鱓", "金农", "汪士慎", "张照", "郑燮", "丁敬", "杨法", "爱新觉罗·弘历", "刘墉", "梁国治", "梁同书", "王昶", "王文治", "翁方纲", "段玉裁", "蒋和", "桂馥", "钱伯垌", "张燕昌", "梁巘", "钱沣", "孙星衍", "钱坫", "邓石如", "洪亮吉", "奚冈", "黎简", "爱新觉罗·永瑆", "铁保", "伊秉绶", "范永祺", "钱泳", "阮元", "朱履贞", "吴德旋", "陈鸿寿", "张廷济", "李宗瀚", "吴荣光", "包世臣", "赵之琛", "林则徐", "达受", "何绍基", "吴熙载", "杨宾", "曾国藩", "杨沂孙", "刘熙载", "俞樾", "张裕钊", "胡澍", "赵之谦", "翁同龢", "李文田", "吴大澂", "杨守敬", "吴昌硕", "康有为", "梁启超", "沈曾植", "郑孝胥", "曾熙", "萧蜕", "齐璜", "黄宾虹", "罗振玉", "李瑞清", "赵熙", "王世镗", "章炳麟", "赵时㭎", "陈衡恪", "徐生翁", "谭延闿", "丁佛言", "于右任", "李叔同", "王褆", "黄葆戍", "李健", "叶恭绰", "张宗祥", "马一浮", "沈尹默", "马叙伦", "简经纶", "胡小石", "谢无量", "马公愚", "郑诵先", "郭沫若", "毛泽东", "容庚", "潘天寿", "刘孟伉", "吴湖帆", "徐悲鸿", "王个簃", "吴玉如", "邓散木", "林散之", "陆维钊", "王蘧常", "朱复戡", "沙孟海", "诸乐三", "来楚生", "商承祚", "潘伯鹰", "高二适", "陶博吾", "陆俨少", "台静农", "费新我", "钱君匋", "白蕉", "卫俊秀", "谢稚柳", "启功", "赵冷月", "康殷", "徐无闻", "蓝玉崧", "柳倩", "沈鹏", "欧阳中石", "刘正成", "王岳川", "徐寒", "鲁迅"};
    private final String[] hj = {"张逊", "明雪窗", "边鲁", "吴太素", "因陀罗", "邹复雷", "顾瑛", "张中", "张舜咨", "卫九鼎", "赵原", "马琬", "陈汝言", "张羽", "宋克", "盛著", "王履", "徐贲", "王绂", "夏㫤", "边景昭", "谢环", "戴进", "商喜", "倪端", "马轼", "李在", "陈宪章", "金湜", "谢缙", "杜琼", "朱瞻基", "沈贞", "刘珏", "林良", "姚绶", "孙隆", "陶成", "周臣", "刘俊", "徐端本", "杜堇", "郭诩", "钟钦礼", "吕纪", "吴伟", "张路", "王谔", "张灵", "汪肇", "谢时臣", "沈仕", "王宠", "陆治", "王问", "文彭", "王穀祥", "文嘉", "周之冕", "文伯仁", "钱毂", "居节", "蒋嵩", "周天球", "陆师道", "朱朗", "侯懋功", "宋旭", "项元汴", "仇珠", "孙克弘", "丁云鹏", "马守贞", "尤求", "吴彬", "王綦", "李士达", "邢侗", "朱鹭", "陈继儒", "詹景凤", "邢慈静", "赵左", "陈祼", "李日华", "程嘉燧", "魏之璜", "曾鲸", "袁尚统", "薛素素", "归昌世", "文从简", "李流芳", "沈士充", "张宏", "唐志契", "蓝瑛", "方维仪", "鲁得之", "恽向", "沈颢", "邵弥", "祁豸佳", "文俶", "文柟", "崔子忠", "杨文骢", "项圣谟", "卞文瑜", "杨补", "普荷", "萧云从", "王鉴", "金俊明", "万寿祺", "程正揆", "傅山", "张穆", "顾见龙", "程邃", "郑旼", "汪之瑞", "孙逸", "张风", "吴伟业", "黄向坚", "李因", "方以智", "陈舒", "髡残", "归庄", "法若真", "查士标", "邹之麟", "高俨", "樊圻", "柳如是", "龚贤", "戴本孝", "项德新", "梅清", "高岑", "吴宏", "胡慥", "叶欣", "邹喆", "谢荪", "罗牧", "笪重光", "周淑禧", "牛石慧", "吴历", "王武", "高层云", "高简", "陈字", "顾符稹", "顾昉", "虞沅", "焦秉贞", "杨晋", "王概", "禹之鼎", "蔡含", "姚宋", "黄鼎", "王云", "萧晨", "高其佩", "陈书", "武丹", "唐苂", "李寅", "上官周", "颜峄", "蒋廷锡", "马元驭", "冷枚", "袁江", "唐岱", "华嵒", "沈铨", "袁耀", "高凤翰", "边寿民", "张庚", "张宗苍", "陈撰", "邹一桂", "蔡嘉", "蒋璋", "郎世宁", "闵贞", "方士庶", "恽冰", "马荃", "董邦达", "王致诚", "鲍皋", "艾启蒙", "允禧", "金廷标", "李世倬", "王昱", "钱维城", "蒋宗海", "王宸", "王玖", "王愫", "方婉仪", "金礼赢", "姚文翰", "方薰", "丁皋", "董诰", "潘恭寿", "永瑢", "弘旿", "巴慰祖", "黄易", "奚冈", "黎简", "翟大坤", "骆绮兰", "潘思牧", "张崟", "顾洛", "朱昂之", "钱杜", "顾鹤庆", "陈鸿寿", "张培敦", "张杰", "改琦", "汤贻汾", "蒋宝龄", "张深", "周镐", "王素", "朱沆", "程庭鹭", "何翀", "费丹旭", "戴熙", "朱熊", "张熊", "吴友如", "刘彦冲", "居巢", "张之万", "苏六朋", "苏长春", "郑绩", "王礼", "包栋", "陆恢", "真然", "周闲", "任熊", "胡远", "虚谷", "秦祖永", "朱偁", "居廉", "赵之谦", "沙馥", "蒲华", "钱慧安", "任薰", "吴大澂", "尹沆", "杨伯润", "陈炤", "胡锡珪", "吴滔", "任颐", "缪嘉蕙", "吴庆云", "胡璋", "吴穀祥", "黄士陵", "高邕", "任预", "倪田", "黄山寿", "任霞"};

    private final String[] msj2 = {"李斯", "史游", "丁缓", "杜操", "崔瑗", "蔡邕", "张芝", "刘德晟", "师宜官", "梁鹄", "锺繇", "马钧", "皇象", "苏建", "卫瓘", "卫恒", "索靖", "陆机", "卫铄", "卫夫人", "王羲之", "戴逵", "王献之", "顾恺之", "王珣", "羊欣", "崔浩", "王僧虔", "陆探微", "蒋少游", "郑道昭", "陶弘景", "谢赫", "贝义渊", "张僧繇", "萧绎", "杨子华", "曹仲达", "宇文恺", "智永", "丁道护", "智果", "展子虔", "何稠", "欧阳询", "虞世南", "褚遂良", "窦师伦", "李世民", "阎立德", "阎立本", "尉迟乙僧", "孙过庭", "薛稷", "李思训", "贺知章", "李邕", "吴道子", "曹霸", "张萱", "陈闳", "韩幹", "杨惠之", "张旭", "王维", "徐浩", "颜真卿", "张璪", "周昉", "韦偃", "韩滉", "怀素", "李阳冰", "边鸾", "柳公权", "张彦远", "孙位", "杨凝式", "荆浩", "关仝", "董源", "贯休", "黄筌", "李成", "郭忠恕", "王齐翰", "周文矩", "顾闳中", "赵幹", "卫贤", "喻皓", "李建中", "徐熙", "石恪", "巨然", "范宽", "武宗元", "惠崇", "许道宁", "燕文贵", "蔡襄", "郭熙", "胡瓌", "武元直", "赵昌", "崔白", "赵令穰", "易元吉", "文同", "苏轼", "薛绍彭", "李诫", "李公麟", "黄庭坚", "王诜", "米芾", "李唐", "赵佶", "张择端", "米友仁", "赵伯驹", "扬无咎", "萧照", "朱锐", "苏汉臣", "朱克柔", "陈居中", "马和之", "陆游", "王庭筠", "赵秉文", "刘松年", "李迪", "李嵩", "马远", "夏圭", "梁楷", "张即之", "法常", "牧溪", "赵孟坚", "龚开", "何澄", "钱选", "郑思肖 ", "李衎", "阿尼哥", "高克恭", "赵孟頫", "管道昇", "任仁发", "鲜于枢", "邓文原", "颜辉", "刘元", "王振鹏", "刘贯道", "黄公望", "曹知白", "陈琳", "王渊", "张渥", "吴镇", "王冕", "顾安", "柯九思", "朱德润", "康里巎巎", "杨维桢", "唐棣", "商琦", "朱碧山", "倪瓒", "盛懋", "王蒙", "方从义", "赵原", "马琬", "张成", "杨茂", "宋克", "王履", "王绎", "沈度", "王绂", "解缙", "夏㫤", "戴进", "边景昭", "蒯祥", "何朝宗", "姚绶", "张弼", "沈周", "陈宪章", "史忠", "李东阳", "郭诩", "吴伟", "孙隆", "林良", "周臣", "祝允明", "杜堇", "文徵明", "唐寅", "吕纪", "张路", "王谦", "仇英", "陈淳", "谢时臣", "王宠", "陆治", "文彭", "文伯仁", "钱毂", "周之冕", "徐渭", "陆子刚", "孙克弘", "丁云鹏", "董其昌", "赵左", "沈士充", "何震", "邢侗", "文俶", "朱三松", "江千里", "萧云从", "项圣谟", "王鉴", "程正揆", "程邃", "傅山", "渐江", "弘仁", "石谿", "髡残", "龚贤", "戴本孝", "罗牧", "梅清", "朱耷", "八大山人", "汤鹏", "陈继儒", "汪关", "吴彬", "程君房", "方于鲁", "时大彬", "程嘉燧", "曾鲸", "张瑞图", "张宏", "濮仲谦", "黄道周", "蓝瑛", "张涟", "王铎", "陈洪绶", "崔子忠", "邵弥", "王时敏", "倪元璐", "吴之璠", "封锡禄", "曹素功", "王翚", "王武", "吴历", "恽寿平", "石涛", "王原祁", "禹之鼎", "查士标",
            "高其佩", "郑簠", "上官周", "蒋廷锡", "袁江", "华嵒", "沈铨", "李鱓 ", "高凤翰", "边寿民", "邹一桂", "郎世宁", "郑燮", "郑板桥", "金农", "黄慎", "丁敬", "李方膺", "卢映之", "顾二娘", "刘墉", "梁同书", "王文治", "罗聘", "翁方纲", "邓石如", "永瑆", "铁保", "伊秉绶", "张崟", "钱杜", "陈鸿寿", "改琦", "包世臣", "赵之琛", "苏六朋", "吴熙载", "何绍基", "费丹旭", "居巢", "杨沂孙", "任熊", "张裕钊", "虚谷", "赵之谦", "任薰", "吴大澂", "任颐", "任伯年", "吴友如", "吴昌硕", "黄士陵", "吴庆云", "齐白石", "黄宾虹", "王震", "李铁夫", "陈师曾", "陈半丁", "何香凝", "金城", "于右任", "高剑父", "李叔同", "叶恭绰", "沈尹默", "陈树人", "刘奎龄", "姜丹书", "吕凤子",
            "王梦白", "于非闇 ", "高奇峰", "贺天健", "胡佩衡", "朱屺瞻", "邓以蛰", "颜文樑", "吴湖帆", "汪亚尘", "王悦之", "俞剑华", "徐悲鸿", "梁鼎铭", "秦仲文", "刘海粟", "周轻鼎", "陈之佛", "溥心畲", "潘天寿", "王个簃", "王子云", "邓散木", "丰子恺", "黄君壁", "林散之", "卫天霖", "李苦禅", "张大千", "钱松嵒", "杭穉英", "沙孟海", "张光宇", "伍蠡甫", "林风眠", "关良", "张书旂  ", "滑田友", "倪贻德", "黄文农", "丁衍庸", "司徒乔", "王雪涛", "吴大羽", "常任侠", "许幸之", "常书鸿", "蒋兆和", "刘开渠", "傅抱石", "史岩", "赵少昂", "余本", "唐一禾", "吕斯百", "沈福文", "秦宣夫", "雷圭元", "庞薰琹", "赵望云", "叶浅予", "李桦", "李可染", "张充仁", "曾竹韶", "邓白", "王临乙", "何海霞", "吴作人", "王朝闻", "陆俨少", "蔡若虹", "江丰", "谢稚柳", "黎雄才", "胡一川", "张乐平", "唐云", "王式廓", "陈烟桥", "王合内", "启功", "陈子庄", "关山月", "力群", "黄苗子", "萧传玖", "董希文", "华君武", "赖少其", "赵宏本", "王逊", "艾中信", "廖冰兄", "特伟", "罗工柳", "黄新波", "彦涵", "丁聪", "张仃", "王琦", "米谷", "吴冠中", "古元", "邵宇", "石鲁", "程十发", "赵无极", "贺友直", "黄永玉", "黄胄", "高虹"};
    private final String[] wxj2 = {"元好问", "蔡松年", "赵秉文", "李纯甫", "辛愿", "赵可", "王庭筠", "李俊民", "王若虚", "赵元",
            "杨云翼", "蔡珪", "完颜璹", "刘中尹", "元好问", "蔡松年", "党怀英", "赵秉文", "李纯甫", "元好问", "王若虚", "耶律楚材", "刘秉忠", "方回", "王恽", "戴表元", "仇远", "刘因", "赵孟頫", "袁桷", "杨载", "虞集", "范梈", "揭傒斯", "朱德润", "杨维桢", "许有壬", "张翥", "萨都剌", "倪瓒", "迺贤", "顾瑛", "王冕", "张之翰", "刘敏中", "陆文圭", "袁易", "张雨", "李孝光", "张翥", "萨都剌", "倪瓒", "邵亨贞", "王恽", "姚燧", "柳贯", "欧阳玄", "黄溍", "马祖常", "苏天爵", "杜仁杰", "胡祗遹", "卢挚", "薛昂夫", "张可久", "贯云石", "张养浩", "乔吉", "刘致", "徐再思", "张鸣善", "王和卿",
            "杨朝英", "汪元亨", "刘庭信", "睢景臣", "曾瑞", "白朴", "李文蔚", "石君宝", "关汉卿", "王实甫", "马致远", "郑光祖", "杨显之", "张国宾", "李直夫", "郑廷玉", "纪君祥", "尚仲贤", "王伯成", "杨梓", "乔吉", "秦简夫", "朱凯", "李好古", "康进之", "武汉臣", "高文秀", "费唐臣", "官天挺", "高明", "刘基", "杨基", "高启", "袁凯", "马中锡", "李东阳", "王九思", "唐寅", "文徵明", "李梦阳", "王廷相", "王廷陈", "康海", "何景明", "边贡", "徐祯卿", "杨慎", "皇甫冲", "谢榛", "高叔嗣", "徐中行", "李攀龙", "吴国伦", "王世贞", "梁有誉", "袁宗道", "高攀龙", "袁宏道", "钟惺", "劳中道", "谭元春",
            "瞿式耜", "陈子龙", "张煌言", "夏完淳", "瞿佑", "聂大年", "杨循吉", "王世贞", "施绍莘", "陈子龙", "宋濂", "刘基", "方孝孺", "吴宽", "马中锡", "祝允明", "王守仁", "何孟春", "归有光", "唐顺之", "王慎中", "茅坤", "王世贞", "宗臣", "李贽", "袁宗道", "袁宏道", "王思任", "钟惺", "袁中道", "艾南英", "徐霞客", "谭元春", "刘侗", "张岱", "张溥", "散曲作家", "汤式", "王九思", "王磐", "杨慎", "陈铎", "金銮", "冯惟敏", "薛论道", "顾大典", "刘效祖", "赵南星", "沈自晋", "赵庆熺", "贾仲明", "杨讷", "朱有燉", "邵灿", "徐霖", "邱濬", "康海", "李开先", "徐渭", "高濂", "李日华", "梁辰鱼",
            "汪道昆", "王世贞", "周朝俊", "汤显祖", "屠隆", "沈璟", "王骥德", "孙钟龄", "冯梦龙", "吕天成", "阮大铖", "罗贯中", "瞿佑", "施耐庵", "李昌祺", "吴承恩", "罗懋登", "冯梦龙", "凌濛初", "陈忱", "董说", "徐祯卿", "谢榛", "王世贞", "李贽", "袁宏道", "王骥德", "钱谦益", "陈贞慧", "吴伟业", "杜濬", "钱澄之", "顾炎武", "归庄", "屈大钧", "冯班", "宋琬", "余怀", "施闰章", "尤侗", "吴嘉纪", "叶燮", "梁佩兰", "吴兆骞", "彭孙遹", "陈恭尹", "王士祯", "宋荦", "查慎行", "赵执信", "屈复", "沈德潜", "郑燮", "胡天游", "衰枚", "蒋士铨", "赵翼", "姚鼐", "翁方纲", "洪亮吉", "黎简", "黄景仁",
            "吴锡麒", "王昙", "孙原湘", "张问陶", "舒位", "彭兆荪", "汪端", "席佩兰", "吴伟业", "王夫之", "吴绮", "孙枝蔚", "顾景星", "毛奇龄", "陈维崧", "唐梦赉", "朱彝尊", "毛际可", "曹贞吉", "蒋景祁", "徐釚", "顾贞观", "纳兰性德", "厉鹗",
            "吴锡麒", "黄景仁", "张惠言", "项鸿祚", "钱谦益", "黄宗羲", "方以智", "冒襄", "周亮工", "侯方域", "毛奇龄", "魏禧", "汪琬", "陈维崧", "姜宸英", "邵长蘅", "戴名世", "方苞", "胡天游", "刘大櫆", "全祖望", "衰枚", "姚鼐", "吴骞", "沈复", "汪中", "洪亮吉", "恽敬", "阮元", "章学诚", "李兆洛", "吴伟业", "李玉", "朱（白＋隺）", "李渔", "尤侗", "洪昇", "孔尚任", "黄图珌", "杨潮观", "方成培", "蒋士铨", "查慎行", "李渔", "蒲松龄", "褚人获", "钱彩", "吴敬梓", "夏敬渠", "曹雪芹", "纪昀", "李汝珍", "高鹗", "张潮", "金人瑞", "毛宗岗", "李渔", "王夫之", "叶燮", "王士禛", "袁枚"};

    private final String[] qt = {"样式雷", "山子张", "泥人张", "面人汤"};

    private final String[] xqj = {"姜妙香", "叶盛兰", "陈德霖", "王瑶卿", "阎岚秋", "冯子和", "赵君玉", "梅兰芳", "于连泉", "苟慧生", "尚小云", "赵桐珊", "程砚秋", "龚云甫", "李多奎", "何桂山", "黄润甫", "钱金福", "郝寿臣", "金少山", "裘盛戎", "黄三雄", "王长林", "罗寿山", "萧长华", "叶盛章", "李金顺", "白玉霜", "刘翠霞", "李再雯", "侯俊山", "田际云", "小香水", "金钢钻", "乔国瑞", "丁果仙", "郧三吉", "祁彦子", "郭宝臣", "王存才", "阎逢春", "赵清海", "段二淼", "姚水娟", "江和义", "陆长胜", "吴昌顺", "汪筱奎", "严凤英", "黄文狄", "蔡尤本", "董义芳", "邵江海", "李少楼", "窦朝荣", "余洪元", "李春森", "董瑶阶", "吴天保", "沈云陔", "吴绍芝", "徐绍清", "郭品文", "邱吉彩", "白驹荣", "马师曾", "薛觉先", "郑长和", "黄粦传", "林秀甫", "谢玉君", "康子林", "萧楷成", "贾培之", "曹俊臣", "魏香庭", "张德成", "天籁", "周慕莲", "傅三乾", "刘成基", "栗成之", "罗香圃", "张禹卿", "王天民", "李正敏", "苏育民", "扎西顿珠", "侯喜瑞", "侯玉山", "刘毓中", "俞振飞", "郑奕奏", "周传瑛", "阳友鹤", "陈伯华", "尹羲", "张君秋", "袁雪芬", "常香玉", "筱文艳", "丁是娥", "红线女", "新凤霞", "彭俐侬", "王秀兰", "姚璇秋", "潘凤霞", "［舞台美术师", "张聿光", "幸熙", "谢杏生", "苏石风", "［戏曲理论家及论著", "钟嗣成", "朱权", "何良俊", "魏良辅", "李贽", "王骥德", "臧懋循", "潘之恒", "徐复祚", "吕天成", "凌濛初", "祁彪佳", "金人瑞", "李渔", "徐麟", "徐大椿", "李调元", "叶堂", "焦循", "梁廷枬", "杨恩寿", "王季烈", "王国维", "齐如山", "三爱", "柳亚子", "吴梅", "欧阳予倩", "郑振铎", "冯沅君", "周贻白", "马可", "任中敏", "孙楷第", "钱南扬", "赵景深", "王季思", "郑骞", "阿甲", "马彦祥", "张庚", "［曲艺作家］", "董解元", "贾凫西", "罗松窗", "鹤侣", "韩小窗", "张长弓", "赵树理", "［曲艺表演艺术家", "文溆", "孔三传", "张五牛", "张山人", "柳敬亭", "王周士", "陈遇乾", "俞秀山", "黄辅臣", "石玉昆", "马如飞", "马三峰", "随缘乐", "穷不怕", "朱绍文", "何老凤", "双厚坪", "德寿山", "夏荷生", "朱化麟", "潘诚立", "刘宝全", "白云鹏", "张小轩", "韩永禄", "金万昌", "万人迷", "赵玉峰", "焦德海", "许继祥", "潘伯英", "黄兆麟", "常澍田", "荣剑尘", "王无能", "张寿臣", "谢大玉", "商业兴", "茹兴礼", "邓九如", "乔清秀", "花四宝", "卢成科", "王少堂", "陈士和", "舒三和", "霍树棠", "李青山", "徐小楼", "胡景岐", "贾树三", "李德才", "王秉诚", "常宝堃", "王尊三", "刘天韵", "陈春生", "白风岩", "白风鸣", "周玉泉", "周云瑞", "靳文然", "琶杰", "毛依罕", "徐云志", "侯宝林", "高元钧", "骆玉笙", "蒋月泉", "韩起祥"
    };
    private final String[] yyj2 = {"大百科", "音乐", "祖孝孙", "祝凤喈", "朱载堉", "朱英", "朱勤甫", "朱践耳", "周小燕", "周巍峙", "周淑安", "郑志声", "郑译", "郑律成", "郑京和", "赵元任", "赵沨", "张子谦", "张贞黻", "张曙", "张孔山", "张洪岛", "喻宜萱", "应尚能", "殷承宗", "姚炳炎", "杨仲子", "杨元亨", "杨荫浏", "杨时百", "杨嘉仁", "严良堃", "严老烈", "严澂", "荀勗", "许和子", "许常惠", "徐天民", "徐上瀛", "徐祺", "萧友梅", "向隅", "冼星海", "武满彻", "吴祖强", "吴畹卿", "吴梦非", "吴景略", "吴伯超", "卫仲乐", "王善", "王朴", "王露", "王昆", "王光祈", "王宾鲁", "汪昱庭", "万宝常", "汤应曾", "谭小麟", "谭抒真", "孙慎", "斯义桂", "时乐濛", "师旷", "沈知白", "沈肇州", "沈亚威", "沈心工", "沈括", "色拉西", "三善晃", "任光", "瞿希贤", "瞿维", "青主", "钱仁康", "钱乐之", "婆罗多", "裴神符", "聂耳", "缪天瑞", "孟波", "毛敏仲", "麦新", "马友友", "马思聪", "马可", "吕文成", "吕骥", "吕才", "罗宗贤", "刘天华", "刘诗昆", "刘德海", "伶州鸠", "伶伦", "林谦三", "李元庆", "李延年", "李廷松", "李叔同", "李名强", "李冕相", "李隆基", "李凌", "李劫夫", "李嘉禄", "李焕之", "李德伦", "李翠贞", "黎锦晖", "黎国荃", "雷威", "郎毓秀", "夔", "孔子", "康昆仑", "京房", "姜夔", "江文也", "江定仙", "嵇康", "黄自", "黄友葵", "黄贻钧", "黄勉之", "桓伊", "桓谭", "贺绿汀", "何柳堂", "何承天", "郭沔", "郭兰英", "管平湖", "顾圣婴", "傅聪", "丰子恺", "费克", "范继森", "段善本", "杜鸣心", "杜夔", "丁善德", "黛敏郎", "戴顒", "陈仲儒", "陈又新", "陈田鹤", "陈康士", "陈洪", "查阜西", "曹妙达", "蔡元定", "蔡邕", "蔡绍序", "才旦卓玛", "伯牙", "毕达哥拉", "白明达", "安来绪", "安波", "阿炳", "华彦钧", "苏祗婆", "张寒晖"};
    private final String[] wdj2 = {"大百科", "舞蹈", "吴晓邦", "赵得贤", "戴爱莲", "胡果刚", "梁伦", "贾作光", "胡蓉蓉", "李承祥", "舒巧", "崔美善", "许淑媖", "张均", "赵青", "陈翘", "陈爱莲", "白淑湘", "阿依吐拉", "莫德格玛", "刀美兰", "林怀民"};
    private final String[] temp = {"苏轼", "陆游", "王羲之", "黄庭坚", "李斯", "郑板桥", "颜真卿", "赵孟頫"};
    String[] sfj_year2 = {"李世民", "米芾", "贺知章",
            "张旭", "徐渭", "刘墉", "董其昌", "吴昌硕", "柳公权", "陆机", "陶弘景", "蔡邕", "怀素", "解缙", "虞世南", "李东阳",
            "傅山", "欧阳询", "何绍基", "褚遂良", "赵佶", "金农", "王献之", "王铎", "陈继儒", "文徵明"};
    protected static final String[] sfj_split_year = {
            "苏轼",
            "陆游",
            "王羲之",
            "黄庭坚",
            "李斯",
            "郑板桥",
            "颜真卿",
            "赵孟頫",
            "李世民",
            "米芾",
            "贺知章",
            "张旭",
            "徐渭",
            "刘墉",
            "董其昌",
            "吴昌硕",
            "柳公权",
            "陆机",
            "陶弘景",
            "蔡邕",
            "怀素",
            "解缙",
            "虞世南",
            "李东阳",
            "傅山",
            "欧阳询",
            "何绍基",
            "褚遂良",
            "赵佶",
            "金农",
            "王献之",
            "王铎",
            "陈继儒",
            "文徵明"
    };

    String[] wxj_year = {"李白", "苏轼",
            "杜甫",
            "王安石",
            "屈原",
            "曹操",
            "白居易",
            "诸葛亮",
            "韩愈",
            "陆游",
            "司马迁",
            "欧阳修",
            "柳宗元",
            "岳飞",
            "朱熹",
            "陶渊明",
            "王维",
            "刘禹锡",
            "司马光",
            "范仲淹",
            "李清照",
            "曹雪芹",
            "杜牧",
            "辛弃疾",
            "李商隐",
            "文天祥",
            "王羲之",
            "蒲松龄",
            "黄庭坚",
            "纪昀",
            "孟浩然",
            "贾谊",
            "李斯",
            "袁枚"
    };
    String[] sfj_1912_2008_union = {"苏轼", "陆游", "王羲之", "黄庭坚", "李斯",
            "郑板桥", "颜真卿", "赵孟頫", "李世民",
            "米芾",
            "贺知章",
            "张旭", "郑燮", "徐渭",
            "刘墉", "董其昌",
            "吴昌硕", "柳公权", "陆机",
            "陶弘景",
            "蔡邕",
            "怀素",
            "解缙",
            "虞世南",
            "李东阳", "傅山", "欧阳询", "何绍基", "褚遂良",
            "赵佶",
            "金农",
            "王献之",
            "王铎",
            "陈继儒",
            "文徵明",
            "蔡襄",
            "祝允明",
            "杨维桢",
            "翁方纲",
            "赵之谦",
            "邓石如",
            "黄道周",
            "李邕",
            "包世臣",
            "吴大澂",
            "孙过庭",
            "智永",
            "赵秉文",
            "鲜于枢",
            "崔浩",
            "王文治",
            "李建中",
            "杨凝式",
            "伊秉绶",
            "倪元璐",
            "王庭筠",
            "徐浩",
            "张裕钊",
            "王僧虔",
            "张瑞图",
            "李阳冰",
            "王宠",
            "文彭",
            "铁保",
            "柯九思",
            "梁同书",
            "管道昇",
            "王珣",
            "陈鸿寿",
            "吴熙载",
            "宋克",
            "薛稷",
            "张弼",
            "邓文原",
            "卫夫人",
            "丁敬",
            "张芝",
            "邢侗",
            "崔瑗",
            "智果",
            "皇象",
            "张即之",
            "沈度",
            "郑道昭",
            "程邃",
            "索靖",
            "卫瓘",
            "黄士陵",
            "薛绍彭",
            "何震",
            "郑簠",
            "陈宪章",
            "赵之琛",
            "程正揆",
            "羊欣",
            "永瑆",
            "孙克弘",
            "卫恒",
            "卫铄",
            "史游",
            "汪关",
            "苏建",
            "梁鹄",
            "丁道护",
            "康里巎巎",
            "锺繇",
            "贝义渊",
            "师宜官",
            "杜操",
            "钱毂",
            "刘德晟",
    };

    protected static final String[] hj_1912_2008 = {"苏轼", "王维", "王蒙", "郑板桥", "赵孟頫", "米芾", "唐寅", "郑燮", "徐渭", "董其昌", "吴昌硕", "蒋廷锡", "王冕", "陈琳", "顾恺之", "倪瓒", "吴道子", "赵佶", "石涛", "金农", "沈周", "八大山人", "惠崇", "陈继儒", "文徵明", "陈洪绶", "赵之谦", "贯休", "李唐", "李成", "张宏", "阎立本", "吴镇", "郭熙", "文同", "郑思肖 ", "黄公望", "吴伟", "朱耷", "李公麟", "李迪", "李思训", "陈淳", "龚贤", "任伯年", "萧绎", "黄慎", "董源", "王鉴", "王时敏", "高凤翰", "张萱", "仇英", "恽寿平", "张择端", "马远", "虚谷", "王原祁", "韩滉", "范宽", "王庭筠", "荆浩", "巨然", "王诜", "弘仁", "戴进", "王翚", "罗聘", "王谦", "周昉", "展子虔", "吴历", "王渊", "王履", "任颐", "高克恭", "郭忠恕", "米友仁", "黄筌", "李方膺", "郎世宁", "柯九思", "刘松年", "张僧繇", "高其佩", "梁楷", "韩幹", "管道昇", "钱选", "赵孟坚",
            "顾闳中", "王绂", "蓝瑛", "谢赫", "邹一桂", "徐熙", "张彦远", "张路", "王武", "改琦", "林良", "吴彬", "李嵩", "戴逵", "髡残", "朱德润", "任熊", "赵昌", "程嘉燧", "薛稷", "查士标", "梅清", "萧云从", "周文矩", "项圣谟", "石谿", "边寿民", "法常", "袁江", "吕纪", "费丹旭", "唐棣", "丁云鹏", "周臣", "夏圭", "陆治", "华嵒", "李鱓 ", "许道宁", "崔白", "杨沂孙", "龚开", "禹之鼎", "程邃", "任仁发", "姚绶", "崔子忠", "马和之", "关仝", "张璪", "孙位", "沈铨", "钱杜", "吴友如", "燕文贵", "李衎", "周之冕", "渐江", "曾鲸", "任薰", "居巢", "戴本孝", "程正揆",
            "王绎", "武宗元", "苏汉臣", "何澄", "韦偃", "张渥", "赵伯驹", "孙克弘", "易元吉", "赵令穰", "文伯仁", "石恪", "阎立德", "王振鹏", "谢时臣", "杨子华", "盛懋", "陆探微", "赵左", "颜辉", "苏六朋", "曹知白", "边景昭", "尉迟乙僧", "方从义", "杜堇", "张崟", "扬无咎", "孙隆", "卫贤", "刘贯道", "罗牧", "赵幹", "萧照", "陈居中", "邵弥", "上官周", "顾安", "王齐翰", "郭诩", "马琬", "沈士充", "胡瓌", "赵原", "朱锐", "武元直", "文俶", "曹霸", "边鸾", "曹仲达", "史忠", "吴庆云", "牧溪", "陈闳", "商琦", "窦师伦", "钱毂", "夏㫤"
    };
    protected static final String[] hj_split_year_ready ={"苏轼","王维","王蒙","郑板桥","赵孟頫","米芾","唐寅","徐渭","董其昌","吴昌硕","蒋廷锡","王冕","陈琳","顾恺之","倪瓒","吴道子","赵佶","石涛","金农","沈周","八大山人","惠崇","陈继儒","文徵明","陈洪绶","赵之谦","贯休","李成","阎立本","吴镇","郭熙","文同",};
    protected static final String[] hj_split_year ={"郑思肖 ","黄公望",
    };
}
