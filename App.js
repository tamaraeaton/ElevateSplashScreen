// import { StatusBar } from 'expo-status-bar';
import React, {useEffect} from 'react';
import { StyleSheet, Text, View } from 'react-native';
import RNBootSplash from "react-native-bootsplash";

export default function App() {

  useEffect(() => {
    RNBootSplash.hide();
  },[])

  return (
    <View style={styles.container}>
      <Text>Did you see the Splash Screen?</Text>
      {/* <StatusBar style="auto" /> */}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
