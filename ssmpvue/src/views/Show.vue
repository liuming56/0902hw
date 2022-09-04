<template>
    <div>
            <h2>用户列表</h2>
        <div><input type="checkbox" @change="all" > 全选  <button @click="add()">添加</button>   <button @click="xiugai()">修改</button> </div>    
        <table>
           
            <div v-if="list.length == 0">
            <div>暂无数据</div>
            </div>
            <div v-else>
                <tr>
                <th>选择</th>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>电话</th>
            </tr>
            <tr v-for="w,index in list" :key="index">
            <td> <input type="checkbox" :checked="ischecked"> </td>
            <td>{{w.wid}}</td>
            <td>{{w.wname}}</td>
            <td>{{w.wsex}}</td>
            <td>{{w.wtel}}</td>
            </tr>
            </div>
            
            
            
           
        </table>
    </div>
</template>

<script>
import axios from 'axios';
    
    export default {
        name:"Show",
        data(){
            return{
                deptid:"",
                list:[],
                ischecked:false,
                isch:false,
                idlist:[],


            }
        },
       async created(){
            this.deptid = this.$route.query.did;
            const {data} = await axios.get("http://localhost:8080/getDept?id="+this.deptid);
            this.list = data;
        },
        methods:{
            all(){
                this.ischecked = !this.ischecked;
            },
            add(){
                this.$router.push("/Add")
            },
            xiugai(){
                
            },
            select(wid){
                

            }
        },
        watch:{

        }
        
    }
</script>

<style lang="scss" scoped>

</style>