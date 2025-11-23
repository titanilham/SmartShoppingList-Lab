package com.example.smartshoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация RecyclerView
        initializeRecyclerView();

        // Загрузка тестовых данных
        loadTestData();
    }

    private void initializeRecyclerView() {
        // Находим RecyclerView в разметке
        recyclerView = findViewById(R.id.recyclerViewShoppingList);

        // Устанавливаем LayoutManager (отвечает за расположение элементов)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Создаем адаптер с пустым списком (пока)
        adapter = new ShoppingListAdapter(new ArrayList<>());

        // Устанавливаем адаптер
        recyclerView.setAdapter(adapter);
    }

    private void loadTestData() {
        // Создаем тестовый список покупок
        List<ShoppingItem> testData = new ArrayList<>();
        testData.add(new ShoppingItem("Молоко", false));
        testData.add(new ShoppingItem("Хлеб", true));
        testData.add(new ShoppingItem("Яйца", false));
        testData.add(new ShoppingItem("Сыр", false));
        testData.add(new ShoppingItem("Яблоки", true));
        testData.add(new ShoppingItem("Кофе", false));
        testData.add(new ShoppingItem("Макароны", false));
        testData.add(new ShoppingItem("Курица", false));
        testData.add(new ShoppingItem("Рис", true));
        testData.add(new ShoppingItem("Огурцы", false));

        // Обновляем данные в адаптере
        adapter = new ShoppingListAdapter(testData);
        recyclerView.setAdapter(adapter);


    }
}