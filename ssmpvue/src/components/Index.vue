<template>
    
    <div>
<el-container>
  <el-header>
    
    
    </el-header>
    
  <el-container>
      <div >
            <h2 ><span class="span1"></span>用户菜单 <span></span></h2>
            <nav>
                <ul >
                    <li v-for="dept,index in list" :key="index"><router-link :to="{path:'/Show',query:{did:dept.deptid}}" active-class="active" @click="GoToShow" >{{dept.dname}}</router-link></li>
                    <!-- <li v-for="dept,index in list" :key="index"><a href="" @click.prevent="GoToShow(dept.deptid)">{{dept.dname}}</a></li> -->
                    
                   
                </ul>
            </nav>
        </div>
    <el-container>
      <el-main>
        <router-view> </router-view>
      </el-main>
      
    </el-container>
  </el-container>
</el-container>
    </div>
</template>

<script>
import axios from 'axios'
    export default {
        name:"Index",
        data(){
            return{
               list:[],
               dname:"", 
            }
            
        },
        async created(){
            const {data} = await axios.get("http://localhost:8080/getAll");
            this.list = data;
        },
        methods:{
           async GoToShow(){
            if (location.href.indexOf("#reloaded")<=0) {
             location.href = location.href + "#reloaded"+"#reloaded";
                location.reload();
    }
            }
        }
        
    }
</script>

<style lang="scss" scoped>

</style>