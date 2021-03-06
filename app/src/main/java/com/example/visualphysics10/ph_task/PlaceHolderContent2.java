package com.example.visualphysics10.ph_task;

import androidx.annotation.NonNull;

import com.example.visualphysics10.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaceHolderContent2 {

    public static final List<PlaceHolderContent2.PlaceHolderItem2> ITEMS = new ArrayList<PlaceHolderContent2.PlaceHolderItem2>();

    public static final Map<String, PlaceHolderContent2.PlaceHolderItem2> ITEM_MAP = new HashMap<String, PlaceHolderContent2.PlaceHolderItem2>();

    private static final int COUNT = 5;

    static {
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceHolderItem2(i));
        }
    }

    private static void addItem(PlaceHolderContent2.PlaceHolderItem2 item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static PlaceHolderContent2.PlaceHolderItem2 createPlaceHolderItem2(int position) {
        return new PlaceHolderContent2.PlaceHolderItem2(String.valueOf(position), switchLesson(position), switchImageView(position));
    }


    private static String switchLesson(int position) {
        switch (position){
            case 1:
                return "Задачи на ускорение";
            case 2:
                return "Задачи на Движение по Окружности";
            case 3:
                return "Задачи на II Закон Ньютона";
            case 4:
                return "Задачи на Движение под углом";
            case 5:
                return "Задачи на Закон Сохранения Импульса";
            default: return "";
        }
    }



    static int switchImageView(int position) {
        switch (position){
            case 1: return R.drawable.task1;
            case 2: return R.drawable.task2;
            case 3: return R.drawable.task3;
            case 4: return R.drawable.task4;
            case 5: return R.drawable.task5;
            default: return 0;
        }
    }

    public static class PlaceHolderItem2 {
        public final String id;
        public final String title;
        public final int imageView;


        public PlaceHolderItem2(String id, String content, int imageView) {
            this.id = id;
            this.title = content;
            this.imageView = imageView;
        }

        @NonNull
        @Override
        public String toString() {
            return title;
        }
    }

}
