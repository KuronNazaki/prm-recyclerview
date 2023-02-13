# RecyclerView Demonstration - PRM392
![Demo image](https://github.com/KuronNazaki/prm-recyclerview/blob/main/demo.png "Demo")
## Project Breakdown
---
This exercise requires creating a simple Android app using RecyclerView
### Layouts
- `activity_main.xml`: the main activity layout of the app. This layout contains two fragments which are divided into two tabs
- `fragment_first.xml`: this fragment contains the `RecyclerView`
- `exam_card.xml`: the layout for each item of the `RecyclerView`
### Classes
- `Exam`: the class containing `RecyclerView`'s item data
- `ExamViewHolder`: the class containing the layout for an individual item in the list
- `RecyclerAdapter`: the class creating `ViewHolder` objects and also setting the data for those views
- `FirstFragment`: the class containing the use of `RecyclerView`
- `MainActivity`: the main activity
### Usage of `RecyclerView`
1. Prepare a list of data
    ```kotlin
    val list = ArrayList<Exam>()
    list.add(Exam("First Exam", "May 23", "Best Of Luck"))
    list.add(Exam("Second Exam", "May 25", "Best Of Luckiest"))
    ```
2. Get the `RecyclerView` using `id`
    ```kotlin
    recyclerView = view.findViewById(R.id.recyclerView)
    ```
3. Create an adapter for the `RecyclerView`. This adapter requires a list of data and a context as constructor parameters
    ```kotlin
    adapter = RecyclerAdapter(list, view.context)
    ```
4. Set the adapter for the `RecyclerView`
    ```kotlin
    recyclerView.adapter = adapter
    ```
5. Set `LayoutManager` for the `RecyclerView`
    ```kotlin
    recyclerView.layoutManager = GridLayoutManager(view.context, 2)
    ```
    
