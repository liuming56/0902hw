<template>
    <div>
        <h2>用户注册</h2>
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" v-model="name"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>
                  
                    <input type="radio" name="sex" value="男" v-model="sex">男 
                    <input type="radio" name="sex" value="女" v-model="sex">女
                  
                </td>
            </tr>
            <tr>
                <td>电话</td>
                <td><input type="text" v-model="tel"></td>
            </tr>
            <tr>
                <td>部门</td>
                <td>
                    <select v-model="deptid">
                        <option value="0" >选择部门</option>
                        <option v-for="dept,index in list" :key="index" :value= dept.deptid >{{dept.dname}}</option>
                    </select>
                </td>
            </tr>
            <tr>
               <td><button @click="save">保存</button> <button @click="clear()">重置</button></td>
            </tr>
        </table>
       
    </div>
</template>

<script>
import axios from 'axios'
    
    export default {
        name:"add",
        data(){
            return{
                list:[],
                name:"",
                sex:"男",
                tel:"",
                deptid:"",
            }
        },
        async created(){
            const {data} = await axios.get("http://localhost:8080/getAll");
            this.list = data;
        },
        methods:{
            clear(){
                this.name="";
                this.sex="男";
                this.tel="";
                this.deptid=0;
            },
            async  save(){
                var worker = {
                    wname:this.name,
                    wsex:this.sex,
                    wtel:this.tel,
                    deptid:this.deptid,
                    wimg:"/img/2.jpeg",
                }
                const {data} = await axios.post("http://localhost:8080/save",worker);
                if(data == 0){
                    alert("添加失败");
                }else{
                    alert("添加成功");
                    
                    this.$router.push("/Show?did="+this.deptid);
                    
                }
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>