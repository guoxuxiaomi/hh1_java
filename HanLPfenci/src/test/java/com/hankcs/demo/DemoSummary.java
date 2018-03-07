/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 19:25</create-date>
 *
 * <copyright file="DemoChineseNameRecoginiton.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014+ 上海林原信息科技有限公司. All Right Reserved+ http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.summary.TextRankSentence;

import java.util.List;

/**
 * 自动摘要
 * @author hankcs
 */
public class DemoSummary
{
    public static void main(String[] args)
    {
        String document = "水利部水资源司司长陈明忠9月29日在国务院新闻办举行的新闻发布会上透露，" +
                "根据刚刚完成了水资源管理制度的考核，有部分省接近了红线的指标，" +
                "有部分省超过红线的指标。对一些超过红线的地方，陈明忠表示，对一些取用水项目进行区域的限批，" +
                "严格地进行水资源论证和取水许可的批准。";
        document = "最近一次扩容是在12月19日，亚投行宣布批准库克群岛、瓦努阿图、白俄罗斯和厄瓜多尔四个经济体的加入申请。\n" +
                "投资运营情况怎样？共贷出42亿美元\n" +
                "除了成员扩展，投资运营也稳步展开。亚投行有关负责人透露，自正式开业运营以来，亚投行已在12个成员国开展了24个基础设施投资项目，项目贷款总额42亿美元，撬动了200多亿美元的公共和私营部门资金。\n" +
                "2017年6-7月，亚投行先后获得了全球三大评级机构穆迪、标准普尔及惠誉的AAA信用评级，10月还获得巴塞尔银行监管委员会零风险权重的认定。\n" +
                "亚投行有关负责人表示，通过细致扎实地做好各项工作，亚投行在国际社会树立了专业、高效、廉洁的21世纪新型多边开发银行的良好形象，赢得了广泛好评。\n" +
                "具体投资了哪些项目？投资项目从贫民窟到地铁均有覆盖\n" +
                "亚投行有关负责人表示，截至目前，其投资的24个项目主要涉及能源、交通、城市基础设施等领域。这些项目都位于亚洲及周边发展中国家，都是财务上可持续、对环境友好、社会经济效益高并且受到当地民众欢迎的项目。\n" +
                "根据亚投行官网介绍，24个项目分布在菲律宾、印度、巴基斯坦、缅甸、印尼等国，内容涉及贫民窟改造、防洪、天然气基础设施建设、高速公路/乡村道路、宽带、电力系统、地铁建设等方面。\n" +
                "以菲律宾首都马尼拉防洪项目为例，其将能确保几百万居民免遭洪涝之害；而为孟加拉国改善以农村地区配电系统为主的项目，可使该国1250多万农村人口受益。\n" +
                "亚投行表示，可持续基础设施、推动私营部门资本参与、跨境互联互通被确定为亚投行今后开展项目投资三大战略重点。\n" +
                "为何成立近两年才有对华项目？先帮助其他中低收入发展中国家\n" +
                "12月11日，亚投行公布首个对华项目，批准2.5亿美元贷款，用于“北京空气质量改善和煤改气”项目。\n" +
                "亚投行表示，“北京空气质量改善和煤改气”项目可以有效降低北京地区的空气可悬浮细颗粒物浓度、减少碳排放、减少煤炭消耗，从而改善北京地区空气质量和环境质量。";
        List<String> sentenceList = HanLP.extractSummary(document, 30);
        System.out.println(sentenceList);
    }
}
