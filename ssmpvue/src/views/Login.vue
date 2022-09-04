<template>
   <div>

<body>
   
       
        <section >
            
                <div>
                    <label for="user">用户名：</label>
                    <input id="user" type="text"  v-model="userid" placeholder="请输入用户名" required/>
                </div>
                <div >
                    <label for="mima">密码：</label>
                    <input id="mima" type="password" name="pwd" v-model="pwd" placeholder="请输入密码" required/>
                </div>
                <div>
                    <input type="submit" value="登录" @click="ToIndex"/>
                    <input type="reset" value="重置" @click="chongzhi() "/>
                </div>
            
        </section>
   

</body>
    </div>
</template>

<script>
    export default {
        name:"login",
        data(){
            return{
                userid:"",
                pwd:"",
            }
        },
        methods:{
            chongzhi(){
                this.userid = "";
                this.pwd = "";
            },
            ToIndex(){
                if(this.userid == "addmin" && this.pwd =="123"){
                    this.$router.push("/Zhuye");
                }else{
                    alert("用户密码错误")
                }
                
            }
        }
        
    }
</script>

<style lang="scss" scoped>

</style>