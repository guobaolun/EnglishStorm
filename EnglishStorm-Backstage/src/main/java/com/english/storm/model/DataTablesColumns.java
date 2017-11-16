package com.english.storm.model;

/**
 * Created by Administrator on 2017/4/3.
 */
public class DataTablesColumns {

        private String data ;                           //字段名 columns 绑定的数据源，由 columns.dataOption 定义。
        private String name ;                           // columns 的名字，由 columns.nameOption 定义。
        private boolean searchable ;                  //标记列是否能被搜索,为true代表可以，否则不可以，这个是由 columns.searchableOption 控制
        private boolean orderable ;                   //标记列是否能排序,为 true代表可以，否则不可以，这个是由 columns.orderableOption 控制
        private DataTablesSearch search ;               //value:标记具体列的搜索条件,特定列的搜索条件是否视为正则表达式， regex:如果为 true代表搜索的值是作为正则表达式处理，为 false则不是。 注意：通常在服务器模式下对于大数据不执行这样的正则表达式，但这都是自己决定的



        public String getData() {
                return data;
        }

        public void setData(String data) {
                this.data = data;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public boolean isSearchable() {
                return searchable;
        }

        public void setSearchable(boolean searchable) {
                this.searchable = searchable;
        }

        public boolean isOrderable() {
                return orderable;
        }

        public void setOrderable(boolean orderable) {
                this.orderable = orderable;
        }

        public DataTablesSearch getSearch() {
                return search;
        }

        public void setSearch(DataTablesSearch search) {
                this.search = search;
        }
}
