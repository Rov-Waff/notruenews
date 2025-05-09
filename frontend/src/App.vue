<template>
  <div id="app">
    <h1 class="title">全假新闻</h1>
    <hr />
    <div id="view">
      <RouterView />
    </div>
  </div>
</template>

<script lang="ts" setup></script>

<style lang="css" scoped>
.title {
  text-align: center;
}
#view {
  box-shadow: 0px 0px 0px #ccc;
  border-radius: 8px;
  border: 3px solid;
  margin-inline: 20%;
  padding: 10px;
}
</style>
