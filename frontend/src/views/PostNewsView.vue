<template>
  <div id="newsform">
    <form>
      <label>标题</label>
      <input v-model="NewsTitle" />
      <br />
      <label>内容</label>
      <textarea rows="10" v-model="NewsContent"></textarea>
      <br />
    </form>
    <button @click="onSubmit">发送</button>
  </div>
</template>

<script setup lang="ts">
import axios from 'axios'
import { useRouter } from 'vue-router'

const router = useRouter()
const NewsTitle = defineModel()
const NewsContent = defineModel('')
const onSubmit = () => {
  axios({
    url: 'http://localhost/api/postNews',
    method: 'POST',
    data: {
      title: NewsTitle.value,
      content: NewsContent.value,
    },
  })
    .then(() => {
      router.push('/')
    })
    .catch((err) => {
      router.push(`/err?errType=${err}`)
    })
}
</script>

<style lang="css" scoped>
#newsform {
  text-align: center;
}
</style>
