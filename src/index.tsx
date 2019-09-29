import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import { App } from './components/App';
import firebase from './firebase';
import './index.scss';
import * as serviceWorker from './serviceWorker';
import { rootReducer } from './store';

// Initialize Firebase
// var fb = app.initializeApp(firebaseConfig);
// refreshAllVotes();
// document.querySelectorAll('button')
//   .forEach((val, idx)=>{
//     val.onclick = (e)=>{
//       // Push a vote
//       getCurrentVote(e.target.id)
//       .then(snapshot =>  {
//         let currentVoteValue = snapshot.val();
//         currentVoteValue++;
//         pushNewVote(e.target.id, currentVoteValue)
//           .then(_=>refreshAllVotes());

//       });
//     }
//   })

const getAllData = () => {
  // let fb = firebase.initializeApp(firebaseConfig);
  // Get Db ref
  return (
    firebase
      .database()
      // Get entire Db contents
      .ref()
      .once('value')
      .then(async snapshot => {
        let entireDbAsJson = snapshot.val();
        console.log(await entireDbAsJson);
        return entireDbAsJson;
      })
  );
};

// function getCurrentVote(voteOptionName){
//   // Get Db ref
//   return fb.database()
//     // Get entire Db contents
//     .ref(voteOptionName)
//     .once('value');
// }

// function pushNewVote(voteOptionName, currentVoteValue){
//   return fb.database()
//     // Get entire Db contents
//     .ref(voteOptionName)
//     .set(currentVoteValue);
// }

getAllData();

const store = createStore(rootReducer);

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
