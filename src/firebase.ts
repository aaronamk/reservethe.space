import firebase from 'firebase';

const config = {
  apiKey: 'AIzaSyAYdb91eT1ZpIFtrbyuJxAO5rLKWN_Emlw',
  authDomain: 'reservethespace-84afb.firebaseapp.com',
  databaseURL: 'https://reservethespace-84afb.firebaseio.com',
  projectId: 'reservethespace-84afb',
  storageBucket: 'reservethespace-84afb.appspot.com',
  messagingSenderId: '797232287580',
  appId: '1:797232287580:web:1decf94a997fe82c25bb99',
  measurementId: 'G-NB0YK172N1',
};

firebase.initializeApp(config);

export default firebase;
