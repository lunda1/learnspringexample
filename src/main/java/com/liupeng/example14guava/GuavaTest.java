package com.liupeng.example14guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by liupeng on 2016/9/21.
 */
public class GuavaTest {


    public static void main(String[] args) {
        //testSplitter();
        //testList();
        //testConstructFiltersLogic();
        //testStringsIsNullOrEmpty();
        //splitNewGrayEa();
//        testNullList();
        testSplitterNull();
    }

    public static void testSplitterNull(){
        System.out.println(Splitter.on(",").splitToList(""));
    }

    public static void testSplitter() {
        Set<String> syncDelDisplayNum = new HashSet<>();
//        syncDelDisplayNum.add("1");
//        syncDelDisplayNum.add("2");
//        syncDelDisplayNum.add("3");
//        syncDelDisplayNum.add("4");
        syncDelDisplayNum.add("5");
        String filtersLogic = "(1and2and11)or(4and5)";
        List<String> orEles = Splitter.on("or").splitToList(filtersLogic);
        //filtersLogic
        System.out.println(orEles);
        //syncDelDisplayNum
        System.out.println("syncDelDisplayNum:" + syncDelDisplayNum);
        List<String> newAndList = new ArrayList<>();
        for (String orEle : orEles) {
            List<String> andList = Splitter.on("and").splitToList(orEle.substring(1, orEle.length() - 1));
            List<String> list = new ArrayList<>(andList);
            list.removeAll(syncDelDisplayNum);
            if (list.size() != 0) {
                String newAnd = Joiner.on("and").join(list);
                newAndList.add("(" + newAnd + ")");
                System.out.println(newAnd);
            }
        }
        String newFiltersLogic = Joiner.on("or").join(newAndList);
        System.out.println("newFiltersLogic:" + newFiltersLogic);
        System.out.println("-----------------------------------");
    }


    public static void testList() {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("3");
        list1.removeAll(list2);
        System.out.println(list1);
    }

    public static void testConstructFiltersLogic() {

        List<FilterList> filterLists = new ArrayList<>();

        FilterList filterList1 = new FilterList();
        FilterList filterList2 = new FilterList();

        List<Filter> filters1 = new ArrayList<>();
        List<Filter> filters2 = new ArrayList<>();

        Filter filter1 = new Filter(1);
        Filter filter2 = new Filter(2);
        Filter filter3 = new Filter(3);
        Filter filter4 = new Filter(4);
        Filter filter5 = new Filter(5);

        filters1.add(filter1);
        filters1.add(filter2);
        filters1.add(filter3);

        filters2.add(filter4);
        filters2.add(filter5);

        filterList1.setList(filters1);
        filterList2.setList(filters2);

        filterLists.add(filterList1);
        filterLists.add(filterList2);

        System.out.println(filterLists);

        List<String> list = new ArrayList<>();
        String[][] arr = new String[filterLists.size()][];
        int num = 1;
        for(int i=0;i<filterLists.size();i++){
            int jLength = filterLists.get(i).getList().size();
            arr[i] = new String[jLength];
            for(int j=0;j<jLength;j++){
                arr[i][j] = String.valueOf(num++);
            }
            list.add("("+Joiner.on("and").join(arr[i])+")");
        }
        String filtersLogic = Joiner.on("or").join(list);
        System.out.println(filtersLogic);


    }
    public static void testStringsIsNullOrEmpty(){
        System.out.println("Strings.isNullOrEmpty(\"\"):"+Strings.isNullOrEmpty(""));
        System.out.println("Strings.isNullOrEmpty(\"null\"):"+Strings.isNullOrEmpty(null));
    }

    public static void splitNewGrayEa(){
        //String eas = "wxlckj,sansitech,yandao888,njshyygfyxgs,xiaoyoucai,mxsy2016,qiyewan,ceheng,omedia,gdfsakezb,pandoras,gzjhylqx,gzjianke,zhidahang,gzjldt,gzzfyq,yhkjled8,474534,443199,bjesxj,hzzmsy,gzbrmy,gzszsmy";
        String eas = "475622,fstestdey,yizumiinjection,jsbmty88,prospect,zjzjxx,fjslxf,gzhskj1,zjusocu,jiangtai,chaoben,gzlilong,sunevap008,szys2016,475098,dyswkgsz,szslcy,ypgjzsjt,ladyart,szshes,tongfule,bjjzysmgs,shlbpj,linglings,hopesmed,szkhyy,tongfule,chk168";
        List<String> easList = Splitter.on(",").splitToList(eas);
        System.out.println("size: ");
        System.out.println(easList.size());
        System.out.println("-----------------------------");
        String newEas = Joiner.on(";").join(easList);
        System.out.println("new str:");
        System.out.println(newEas);
        System.out.println("-----------------------------");
        //当前线上灰度企业个数
        String foneshareEas = "fs;fktest;453339;421080;259335;fstestnc;fsxszx;test;nongmuhangye;support2;fskk000;fstestpx;villawl;408126;158833;whrunjin;428645;dsjsyb;qingyunkeji;qingyun;qddhfkj;qblwhcb;xiaomifeng;sdzswl;shenglide;dkrevenge;tjfxxk;boilink;aizhiyi;ihengyou888;cqwbj2015;fujianredre;zzfujia;fxnanchang;fszhang;465580;465578;465708;465711;lxblgzs;465707;374664;465705;427930;shsbsm;fstest_fxxk;467790;guanghui;ntyushun;hrbrqkj;fxxkjs;whxyun;ljwl8848;282489;458104;467325;465454;saeasia;zhyr123456;467941;synfsyb;447370;jnzngcjx;sdshzsgc;zczhssf;swanrov;wcqpdsw;choicete;jsyxgc;dhvnion;langduo;mindleader;xiahancreations;sci_health;nbfxiaoke;468110;fstestphg;xzftxx;lygctwlkj;kangli;fstestc;470188;470458;hfrtsm;njhdch;bjbkgdxx;czddtest;njtlmt;heyabeauty;hzhtkj;bjlttr;nbtoptec;hzjpcd;470599;haojiajituan;feidiaodianqi;firstunion;wewinservice;chuanqiweiye;fstestlihengxiang;436117;fstestplz;fstestran111;469299;469305;469306;469307;471526;472036;wxlckj;sansitech;yandao888;njshyygfyxgs;xiaoyoucai;mxsy2016;qiyewan;ceheng;omedia;gdfsakezb;pandoras;gzjhylqx;gzjianke;zhidahang;gzjldt;gzzfyq;yhkjled8;474534;443199;bjesxj;hzzmsy;gzbrmy;gzszsmy;475622;fstestdey;yizumiinjection;jsbmty88;prospect;zjzjxx;fjslxf;gzhskj1;zjusocu;jiangtai;chaoben;gzlilong;sunevap008;szys2016;475098;dyswkgsz;szslcy;reformer;ypgjzsjt;ladyart;szshes;tongfule;bjjzysmgs;shlbpj;linglings;hopesmed;szkhyy;tongfule;chk168";
        System.out.println("foneshareEas.size()");
        System.out.println(Splitter.on(";").splitToList(foneshareEas).size());
        System.out.println("-----------------------------");
        String newAddEas = "475622;fstestdey;yizumiinjection;jsbmty88;prospect;zjzjxx;fjslxf;gzhskj1;zjusocu;jiangtai;chaoben;gzlilong;sunevap008;szys2016;475098;dyswkgsz;szslcy;ypgjzsjt;ladyart;szshes;tongfule;bjjzysmgs;shlbpj;linglings;hopesmed;szkhyy;tongfule;chk168";
        System.out.println("newAddEas.split(\";\").length");
        System.out.println(newAddEas.split(";").length);
    }

    public static void testNullList(){
        List<String> strList = new ArrayList();
        String str = Joiner.on(",").join(strList);
        System.out.println("str: "+str);
        System.out.println(Strings.isNullOrEmpty(str));
    }
}



class FilterList{

    private List<Filter> list;

    public List<Filter> getList() {
        return list;
    }

    public void setList(List<Filter> list) {
        this.list = list;
    }

    public String toString(){
        return list.toString();
    }
}

class Filter{

    public Filter(){

    }

    public Filter(int displayNumber){
        this.displayNumber = displayNumber;
    }

    private int displayNumber;

    public int getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(int displayNumber) {
        this.displayNumber = displayNumber;
    }

    public String toString(){
        return String.valueOf(displayNumber);
    }
}
