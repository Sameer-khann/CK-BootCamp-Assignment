// import { useState } from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css'
import Login from './pages/Login'
import DashBoard from './pages/Dashboard'
import Counter from './pages/Counter'
import DigitalWatch from './pages/DigitalWatch'
import ProtectedRoute from './components/ProtectedRoute'
import NotFound from './pages/NotFound'

import NavLayout from './layout/NavLayout'

function App() {


  // function handleLogin() {
  //   setIsAuthenticate(true);
  //   localStorage.setItem("isAuthenticate", "true");
  // }

  return (
    <>

      <Router>
        <Routes>

          <Route path='/' element={<Login />} />

          <Route path="*" element={<NotFound />} />

          <Route path='/dashboard' element={
            <ProtectedRoute>
              <DashBoard />
            </ProtectedRoute>
          }
          />

          <Route element={<NavLayout />}>

            <Route path='/counter' element={
              <ProtectedRoute >
                <Counter />
              </ProtectedRoute>}
            />

            <Route path='/digitalwatch' element={
              <ProtectedRoute >
                <DigitalWatch />
              </ProtectedRoute>}
            />

          </Route>

        </Routes >
      </Router >

    </>
  )
}

export default App
