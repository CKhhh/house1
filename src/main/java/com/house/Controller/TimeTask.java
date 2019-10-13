package com.house.Controller;

import com.house.Bean.Deal;
import com.house.Bean.Listing;
import com.house.Bean.Room;
import com.house.Service.Listing.ListingImpl;
import com.house.Service.Room.RoomImpl;
import com.house.Service.deal.DealImpl;
import com.house.Util.DaysBetween;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Create By  Baimao
 * Time:2019-02-11 12:13
 */
@Component
public class TimeTask {
    @Autowired
    ListingImpl listingimpl;
    @Autowired
    DealImpl dealimpl;
    @Autowired
    RoomImpl roomimpl;
//    @Scheduled(cron = "0 0 0 * * ?")
//    @Scheduled(cron = "*/5 * * * * ?")
@Scheduled(cron = "0 0 0 * * ?")
    public void truncate(){
    dealimpl.truncate();
}
@Scheduled(cron = "0 0 0 * * ?")
    public void tuoguandaoqi(){
        long tuoguanday = 0;
        List<Listing> list = listingimpl.selectAll();
        for (Listing l :list){
            l.getEndTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date dt1 = null;
            try {
                dt1 = df.parse(df.format(new Date()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            tuoguanday = DaysBetween.getDaysBetween(l.getEndTime(),dt1);
            if (tuoguanday<=30){
                Deal deal = new Deal(null,l.getListingId(),null,l.getAddress(),
                        "托管到期",l.getEndTime(),"1",null,null,null);
                dealimpl.insertDeal(deal);
            }
        }
    }
    @Scheduled(cron = "0 0 0 * * ?")
    public void zukedaoqi(){
        long zukedaoqi = 0;
        List<Room> rooms = roomimpl.selectAll();
        for (Room l :rooms){
            l.getEndTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date dt1 = null;
            try {
                dt1 = df.parse(df.format(new Date()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            zukedaoqi = DaysBetween.getDaysBetween(l.getEndTime(),dt1);
            if (zukedaoqi<=30){
                Deal deal = new Deal(null,l.getListingId(),l.getRoomId(),listingimpl.selectAddressByListingId(l.getListingId()),
                        "租客到期",l.getEndTime(),"1",null,null,null);
                dealimpl.insertDeal(deal);
            }
        }
    }
    @Scheduled(cron = "0 0 0 * * ?")
    public void shuidianqi(){
        long shuidianqi = 0;
        List<Listing> list = listingimpl.selectAll();
        for (Listing l :list){
            l.getEndTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date dt1 = null;
            try {
                dt1 = df.parse(df.format(new Date()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            shuidianqi = DaysBetween.getDaysBetween(l.getEndTime(),dt1);
            String[] le = l.getPaymentCycleElectricity().split(";");
            String[] lg = l.getPaymentCycleGas().split(";");
            String[] lw = l.getPaymentCycleWater().split(";");
            Calendar now = Calendar.getInstance();
            int m = (now.get(Calendar.MONTH) + 1);//当前月
            int ee = Integer.parseInt(df.format(l.getStartTime()).substring(3,5));
            if (le[0].equals("后付费")&&le[1].equals("每月")&&l.getElectricityDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal = null;
                    deal = new Deal(null,l.getListingId(),null,l.getAddress(),
                            "电费到期",dt1,"1",null,null,null);
                dealimpl.insertDeal(deal);
            }else if (le[0].equals("后付费")&&le[1].equals("两月")&&(m-ee)%2==0&&l.getElectricityDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")) {
                    Deal deal2 = null;
                    deal2 = new Deal(null, l.getListingId(), null, l.getAddress(),
                            "电费到期", dt1, "1", null, null, null);
                    dealimpl.insertDeal(deal2);
                }else if (le[0].equals("后付费")&&le[1].equals("每月")&&m-ee==1&&l.getElectricityDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal2 = null;
                deal2 = new Deal(null, l.getListingId(), null, l.getAddress(),
                        "电费到期", dt1, "1", null, null, null);
                dealimpl.insertDeal(deal2);
            }
            if (lw[0].equals("后付费")&&lw[1].equals("每月")&&l.getWaterDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal = null;
                    deal = new Deal(null,l.getListingId(),null,l.getAddress(),
                            "水费到期",dt1,"1",null,null,null);
                dealimpl.insertDeal(deal);
            }else if (lw[0].equals("后付费")&&lw[1].equals("两月")&&(m-ee)%2==0&&l.getWaterDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal2 = null;
                    deal2 = new Deal(null,l.getListingId(),null,l.getAddress(),
                            "水费到期",dt1,"1",null,null,null);
            }else if (lw[0].equals("后付费")&&lw[1].equals("两月")&&(m-ee)==1&&l.getWaterDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal2 = null;
                deal2 = new Deal(null,l.getListingId(),null,l.getAddress(),
                        "水费到期",dt1,"1",null,null,null);
            }
            if (le[0].equals("后付费")&&lg[1].equals("每月")&&l.getGasDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal = null;
                    deal = new Deal(null,l.getListingId(),null,l.getAddress(),
                            "燃气到期",dt1,"1",null,null,null);
                dealimpl.insertDeal(deal);
            }else if (lg[0].equals("后付费")&&lg[1].equals("两月")&&(m-ee)%2==0&&l.getGasDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal2 = null;
                    deal2 = new Deal(null,l.getListingId(),null,l.getAddress(),
                            "燃气到期",dt1,"1",null,null,null);
            }else if (lg[0].equals("后付费")&&lg[1].equals("两月")&&(m-ee)==1&&l.getGasDay().equals(now.get(Calendar.DAY_OF_MONTH)+"")){
                Deal deal2 = null;
                deal2 = new Deal(null,l.getListingId(),null,l.getAddress(),
                        "燃气到期",dt1,"1",null,null,null);
            }
        }
    }
    @Scheduled(cron = "0 0 0 * * ?")
    public void cuishouqiankuan(){
        long cuishouqiankuan = 0;
        List<Room> list = roomimpl.selectAll();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date dt1 = null;
        try {
            dt1 = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Room l :list){
            if (Integer.parseInt(l.getArrears())>0&&DaysBetween.getDaysBetween(l.getArrearsEndTime(),dt1)<=3){
                Deal deal = new Deal(null,l.getListingId(),l.getRoomId(),listingimpl.selectAddressByListingId(l.getListingId()),
                        "催收欠款",l.getArrearsEndTime() ,"1",null,null,null);
                dealimpl.insertDeal(deal);
            }
        }
    }
    @Scheduled(cron = "0 0 0 * * ?")
    private void cuishoufangzu(){
        long cuishoufangzu = 0;
        List<Room> list = roomimpl.selectAll();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date dt1 = null;
        try {
            dt1 = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Room l :list){
            String [] a = l.getPaymentPlan().split("%");
            for (String w: a){
                try {
                    if (w.split(";")[3].equals("1")&&Integer.parseInt(w.split(";")[2])>0&&DaysBetween.getDaysBetween(df.parse(w.split(";")[1]),dt1)<=3){
                        Deal deal = new Deal(null,l.getListingId(),l.getRoomId(),listingimpl.selectAddressByListingId(l.getListingId()),
                                "催收房租",df.parse(w.split(";")[1]) ,"1",null,null,null);
                        dealimpl.insertDeal(deal);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    @Scheduled(cron = "0 0 0 * * ?")
    public void yezhudakuan(){
        long yezhudakuan = 0;
        List<Listing> list = listingimpl.selectAll();
        for (Listing l :list){
            l.getEndTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            Date dt1 = null;
            try {
                dt1 = df.parse(df.format(new Date()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            yezhudakuan = DaysBetween.getDaysBetween(l.getEndTime(),dt1);
            String [] a = l.getPaymentPlan().split("%");
            for (String w:a){
                try {
                    if (w.split(";")[3].equals("1")&&Integer.parseInt(w.split(";")[2])>0&&DaysBetween.getDaysBetween(df.parse(w.split(";")[1]),dt1)==0){
                        Deal deal = new Deal(null,l.getListingId(),null,l.getAddress(),
                                "业主打款",df.parse(w.split(";")[1]),"1",null,null,null);
                        dealimpl.insertDeal(deal);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    @Scheduled(cron = "0 0 0 * * ?")
    public void tixingqianyue(){
        long tixingqianyue = 0;
        List<Room> list = roomimpl.selectAll();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date dt1 = null;
        try {
            dt1 = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Room l :list){
            if (l.getStatus()=="已收定金"&&DaysBetween.getDaysBetween(l.getStatusDate(),dt1)<=1){
                Deal deal = new Deal(null,l.getListingId(),l.getRoomId(),listingimpl.selectAddressByListingId(l.getListingId()),
                        "提醒签约",l.getStatusDate() ,"1",null,null,null);
            }
        }

    }
    @Scheduled(cron = "0 0 0 * * ?")
    public void kongzhishijian(){
        long kongzhishijian = 0;
        List<Room> list = roomimpl.selectAll();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date dt1 = null;
        try {
            dt1 = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Room l :list){
            if (l.getStatus()=="空置"&&DaysBetween.getDaysBetween(l.getStatusDate(),dt1)<= 7&&
                    DaysBetween.getDaysBetween(l.getStatusDate(),dt1)>=-7){
                Deal deal = new Deal(null,l.getListingId(),l.getRoomId(),listingimpl.selectAddressByListingId(l.getListingId()),
                        "空置"+DaysBetween.getDaysBetween(l.getStatusDate(),dt1)+"天",l.getStatusDate() ,"1",null,null,null);
            }else if (l.getStatus()=="违约"&&DaysBetween.getDaysBetween(l.getStatusDate(),dt1)<= 7&&
                    DaysBetween.getDaysBetween(l.getStatusDate(),dt1)>=-7){
                Deal deal = new Deal(null,l.getListingId(),l.getRoomId(),listingimpl.selectAddressByListingId(l.getListingId()),
                        "违约"+DaysBetween.getDaysBetween(l.getStatusDate(),dt1)+"天",l.getStatusDate() ,"1",null,null,null);
            }
        }
    }

}
