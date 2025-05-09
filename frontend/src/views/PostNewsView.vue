<template>
  <form id="newsform">
    <label>标题</label>
    <input v-model="NewsTitle" />
    <br />
    <label>内容</label>
    <textarea rows="10" v-model="NewsContent"></textarea>
    <br />
    <button>发送</button>
  </form>
</template>

<script setup lang="ts">
const NewsTitle = defineModel()
const NewsContent = defineModel('')
</script>

<style lang="css" scoped>
#newsform {
  text-align: center;
}
</style>
