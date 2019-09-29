import React from 'react';
import { connect } from 'react-redux';
import { Action, State } from '../store';
import './App.scss';
import { SignInForm } from './SignInForm';

interface Props {
  isLoading: boolean;
  isSignedIn: boolean;
  dispatch: (action: Action) => any;
}

const App = (props: Props) => {
  const { isSignedIn, isLoading } = props;

  return (
    <div className='App'>
      {isSignedIn ? <div>Signed in!</div> : <SignInForm />}
    </div>
  );
};

const connectedComponent = connect(({ isSignedIn, isLoading }: State) => ({
  isSignedIn,
  isLoading,
}))(App);
export { connectedComponent as App };
