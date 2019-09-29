import React from 'react';
import { connect } from 'react-redux';
import { ActionTypes, State } from '../store';

const SignInForm = ({ signIn }: any) => (
  <div onClick={() => signIn()}>Click to sign in!</div>
);

const connectedComponent = connect(
  ({ isSignedIn, isLoading }: State) => ({
    isSignedIn,
    isLoading,
  }),
  dispatch => ({
    signIn: () => dispatch({ type: ActionTypes.SignIn }),
  })
)(SignInForm);
export { connectedComponent as SignInForm };
